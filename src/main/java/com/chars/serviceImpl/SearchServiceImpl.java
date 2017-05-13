package com.chars.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.index.IndexWriterConfig.OpenMode;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.WildcardQuery;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.util.Version;
import org.springframework.stereotype.Service;
import org.wltea.analyzer.lucene.IKAnalyzer;

import com.chars.dao.IHouseDao;
import com.chars.model.House;
import com.chars.service.ISearchService;

@Service
public class SearchServiceImpl implements ISearchService {
	private Directory directory;
	@Resource
	private IHouseDao houseDao;

	public void index() {
		IndexWriter writer;

		try {
			directory = FSDirectory.open(new File("D://index"));
			Analyzer analyzer = new IKAnalyzer();
			IndexWriterConfig conf = new IndexWriterConfig(Version.LUCENE_45, analyzer);
			conf.setOpenMode(OpenMode.CREATE_OR_APPEND);
			conf.setMaxBufferedDocs(100);
			writer = new IndexWriter(directory, conf);

			List<House> houseList = houseDao.selectHouse();
			Iterator<House> it = houseList.iterator();
			while (it.hasNext()) {
				House house = it.next();

				Document document = new Document();
				document.add(new StringField("id", house.getId() + "", Field.Store.YES));
				document.add(new StringField("city", house.getCity(), Field.Store.YES));
				document.add(new StringField("houseAddress", house.getHouseAddress(), Field.Store.YES));
				Term term = new Term("id", house.getId() + "");
				writer.updateDocument(term, document);

			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public IndexSearcher getSearcher() throws IOException {
		IndexReader reader = DirectoryReader.open(directory);
		IndexSearcher searcher = new IndexSearcher(reader);
		return searcher;
	}

	public List<Integer> searchByTerm(String field, String name, int num) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		IndexSearcher searcher = getSearcher();
		Query query = new WildcardQuery(new Term(field, name));
		TopDocs tds = searcher.search(query, num);
		System.out.println("count:" + tds.totalHits);
		for (ScoreDoc sd : tds.scoreDocs) {
			Document doc = searcher.doc(sd.doc);
			list.add(Integer.parseInt(doc.get("id")));
		}
		return list;
	}
}
