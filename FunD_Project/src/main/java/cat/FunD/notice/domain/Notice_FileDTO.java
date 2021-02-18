package cat.FunD.notice.domain;

import lombok.Data;

@Data
public class Notice_FileDTO {
	
	private String notice_uuid;
	private String uploadpath;
	private String file_name;
	private int notice_seq;
	
}
