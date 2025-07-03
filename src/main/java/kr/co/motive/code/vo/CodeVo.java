package kr.co.motive.code.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CodeVo {

	private int codeId;
	private String codeGroup;
	private String codeVal;
	private String codeName;
	private int codeSort;
	private String useYn;
	private Date createDt;
	private Date updateDt;
	private String creater;
	private String updater;

}
