package com.ruifucredit.cloud.commodity.pojo.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class SubGoods {
	
	private Long subGoodsId;
	private Long goodsId;
	private String subName;
	private BigDecimal goodsPrice;
	private Date createTime;
	private Date updateTime;
	private String subStatus;
	
}
