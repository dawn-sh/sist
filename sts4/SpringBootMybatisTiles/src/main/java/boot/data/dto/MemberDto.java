package boot.data.dto;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("member") //mapper에서 쓰일 alias 
public class MemberDto {

	private String num;
	private String name;
	private String id;
	private String pass;
	private String photo;
	private String addr;
	private String email;
	private Timestamp gaipday;
}
