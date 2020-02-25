package com.jt.vo;
/**
 * 为了EasyUI数据回显 封装VO对象.
 * @author tarena
 *
 */

import java.util.List;


import com.jt.pojo.Item;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class EasyUITable {
	private Integer total;	//商品记录总数
	private List<Item> rows;//利用分页算法查询当前页数据
	
}
