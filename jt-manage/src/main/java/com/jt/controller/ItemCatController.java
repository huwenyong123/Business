package com.jt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jt.service.ItemCatService;

@RestController
@RequestMapping("/item/cat")
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService;
	
	/**
	 * 根据商品分类Id号  查询商品分类名称
	 * url:/item/cat/queryItemName"
	 * data:{itemCatId:val}  http:String
	 * 
	 * SpringMVC参数说明:
	 * 		规定:用户传递的参数名称必须和接收参数名称一致
	 * 		1.dispathServlet
	 * 		String data = request.getParameter("itemCatId");
			Long aa = Long.parseLong(data);
	 */
	@RequestMapping("/queryItemName")
	//不执行视图解析器代码
	public String findItemCatNameById(Long itemCatId) {
		
		return itemCatService.findItemCatNameById(itemCatId);
	}
}
