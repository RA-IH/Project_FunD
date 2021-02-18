package cat.FunD.notice.domain;

import lombok.Data;

@Data
public class NoticeDTO {
	
	private String user_id;
	private int notice_seq;
	private String notice_title;
	private String notice_contents;
	private String notice_date;
	private String notice_category;
	private char notice_open;
	
}
