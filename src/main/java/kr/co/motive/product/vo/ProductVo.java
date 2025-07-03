package kr.co.motive.product.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVo {

	private int prodId;
	private String prodName;
	private int prodPrice;
	private String prodColor;
	private String prodSize;
	private String prodGender;
	private int cateId;
	private int prodStock;
	private String prodStatus;
	private String imageUrl;
	private Date createDt;
	private Date updateDt;
	private String creater;
	private String updater;

	private ProductImageVo productImageVo;
}