package com.rest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.bean.ItemBean;
import com.rest.dao.ItemDao;
import com.rest.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDao itemDao;

	@Override
	public List<ItemBean> getItems() {
		List<Item> items = itemDao.getItems();
		List<ItemBean> beans = new ArrayList<ItemBean>();
		for (Item i : items) {
			ItemBean bean = new ItemBean();
			bean.setId(i.getId());
			bean.setName(i.getName());
			beans.add(bean);
		}
		return beans;
	}

	@Override
	public void save(ItemBean itemBean) {
		Item i = new Item(itemBean.getId(), itemBean.getName());
		itemDao.save(i);
	}

}
