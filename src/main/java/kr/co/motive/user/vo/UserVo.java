package kr.co.motive.user.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserVo {

	private String USER_ID;
	private String PASSWORD;
	private String NAME;
	private String NICKNAME;
	private String EMAIL;
	private String PHONE;
	private String ADDRESS1;
	private String ADDRESS2;
	private String ADDRESS3;
	private int USER_ROLE;
	private String SNS_PROVIER;
	private String STATUS;
	private Date CREATE_DT;
	private Date LAST_LOGIN_DT;
	private String LAST_LOGIN_IP;
	private Date LAST_PW_MOD_DATE;
}
