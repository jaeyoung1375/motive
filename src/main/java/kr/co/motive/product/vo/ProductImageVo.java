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
public class ProductImageVo {

	private int imageId;
	private int prodId;
	private String imageUrl;
	private int sortOrder;
	private Date createDt;
}
