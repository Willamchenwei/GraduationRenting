package com.chars.service;

import java.io.IOException;
import java.util.List;

import org.apache.lucene.search.IndexSearcher;

public interface ISearchService {
	public void index();
	public IndexSearcher getSearcher() throws IOException;
	public List<Integer> searchByTerm(String field, String name, int num) throws IOException;
}
