package com.jt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.service.ItemService;
import com.jt.vo.EasyUITable;

//@Controller
@RestController
@RequestMapping("/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	/**
	 * 根据分页查询商品信息
	 * http://localhost:8091/item/query?page=1&rows=50
	 * 作业:
	 * 	 根据分页参数,实现商品列表展现
	 */
	@RequestMapping("/query")
	public EasyUITable findItemByPage(Integer page,Integer rows) {
		
		return itemService.findItemByPage(page,rows);
	}
}
