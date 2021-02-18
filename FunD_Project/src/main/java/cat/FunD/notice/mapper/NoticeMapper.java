package cat.FunD.notice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import cat.FunD.notice.domain.NoticeDTO;
import cat.FunD.notice.domain.Notice_CategoryDTO;
import cat.FunD.notice.domain.Notice_FileDTO;

public interface NoticeMapper {
	//@Select("select * from notice")
	public List<NoticeDTO> getListNotice();
	
	@Select("select * from notice_file")
	public List<Notice_FileDTO> getListNoticeFile();
	
	@Select("select * from notice_category")
	public List<Notice_CategoryDTO> getListNoticeCategory();
}
