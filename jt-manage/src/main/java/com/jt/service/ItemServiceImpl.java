package com.jt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.mapper.ItemMapper;
import com.jt.pojo.Item;
import com.jt.vo.EasyUITable;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemMapper itemMapper;

	@Override
	public EasyUITable findItemByPage(Integer page, Integer rows) {

		int total = itemMapper.selectCount(null);	//获取商品信息记录总数

		/**
		 * 将最近添加的数据最先展现 按照updated排序
		 * SELECT * FROM tb_item ORDER BY updated DESC LIMIT 起始位置,每页展现记录数
			/*查询第一页 每页20条
			SELECT * FROM tb_item ORDER BY updated DESC LIMIT 0,20;    0-19
			/*查询第二页 每页20条
			SELECT * FROM tb_item ORDER BY updated DESC LIMIT 20,20;   20-39 
			/*查询第三页 每页20条
			SELECT * FROM tb_item ORDER BY updated DESC LIMIT 40,20;   40-59 
			/*查询第N页 每页20条
			SELECT * FROM tb_item ORDER BY updated DESC LIMIT (n-1)*rows,rows;  
		 */
		int start = (page-1)*rows;
		List<Item> itemList = 
				itemMapper.findItemByPage(start,rows);
		return new EasyUITable(total, itemList);
	}
}
