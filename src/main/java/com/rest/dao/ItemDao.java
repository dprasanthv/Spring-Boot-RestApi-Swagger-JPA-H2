package com.rest.dao;

import java.util.List;

import com.rest.model.Item;

public interface ItemDao {
	List<Item> getItems();
	void save(Item item);
}
