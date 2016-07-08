package com.rest.service;

import java.util.List;

import com.rest.bean.ItemBean;

public interface ItemService {
	List<ItemBean> getItems();
	void save(ItemBean itemBean);
}
