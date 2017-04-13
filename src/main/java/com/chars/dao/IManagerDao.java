package com.chars.dao;

import java.util.HashMap;

import com.chars.model.Manager;

public interface IManagerDao {
	public Manager getManager (HashMap<String, String> hashMap);
}
