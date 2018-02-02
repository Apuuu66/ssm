package com.len.service.impl;

import com.len.dao.mapper.ItemsMapper;
import com.len.pojo.Items;
import com.len.pojo.ItemsExample;
import com.len.service.ItemsService;
import org.apache.taglibs.standard.tei.ImportTEI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/31 0:19
 */
@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;

	@Override
	public List<Items> list() {
		ItemsExample itemsExample = new ItemsExample();
		List<Items> items = itemsMapper.selectByExampleWithBLOBs(itemsExample);
		return items;
	}

	@Override
	public Items findItemById(int id) {
		Items items = itemsMapper.selectByPrimaryKey(id);
		return items;
	}

	@Override
	public void updateItem(Items items) {
		itemsMapper.updateByPrimaryKeyWithBLOBs(items);
	}
}
