package com.jt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.mapper.ItemCatMapper;
import com.jt.pojo.ItemCat;

@Service
public class ItemCatServiceImpl implements ItemCatService {
	
	@Autowired
	private ItemCatMapper itemCatMaper;

	@Override
	public String findItemCatNameById(Long itemCatId) {
		
		ItemCat itemCat = itemCatMaper.selectById(itemCatId);
		return itemCat.getName();
	}
}
