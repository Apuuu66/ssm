package com.len.service;

import com.len.pojo.Items;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/31 0:18
 */
public interface ItemsService {
	public List<Items> list();


	Items findItemById(int id);

	void updateItem(Items items);
}
