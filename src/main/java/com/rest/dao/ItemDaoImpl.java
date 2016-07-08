package com.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.model.Item;
import com.rest.repository.ItemRepository;

@Repository
public class ItemDaoImpl implements ItemDao {
	@Autowired
	private ItemRepository itemRepository;

	@Override
	public List<Item> getItems() {
		return itemRepository.findAll();
	}

	@Override
	public void save(Item item) {
		itemRepository.save(item);

	}

}
