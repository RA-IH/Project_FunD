<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FUND</title>
<style type="text/css">
.boardElement * {
	display: inline-block !important;
}

.boardElement select {
	width: 30%;
}
</style>
</head>
<body>
	<div id="writeForm">
		<div class="container">
			<div class="row">
				<div class="bg0 flex-wr-sb-c p-rl-25 p-tb-60">
					<div class="panel panel-default">

						<!-- /.panel-heading -->
						<div class="panel-body">

							<form id="boardForm" action="/feed/boardRegister" method="post" enctype="multipart/form-data">
								<ul id="subject">

									<li class="boardElement">
										<%-- <span style="padding-bottom: 10px;">작성자 ${login.m_name }</span> <!-- board의 시퀀스 알아야 한다 --> --%>
									</li>

									<li class="boardElement"><span>게시판</span>
										<select class="form-control">
											<option value="1">카테고리1</option>
											<option value="2">카테고리1</option>
											<option value="3">카테고리1</option>
											<option value="4">카테고리1</option>
											<option value="5">카테고리1</option>
											<option value="6">카테고리1</option>
									</select> <select class="form-control" id="category_seq"
										name="category_seq">
											<option value="7">카테고리2</option>
											<option value="8">카테고리2</option>
									</select></li>

									<li class="boardElement">
										<%-- <input type="hidden" name="category_seq" value='<c:out value="${cri.category_seq}"/>'> <input
											type="hidden" name="id" value="RA"> --%>
									</li>

									<li><span>프로젝트 제목</span>
										<div class="boardInput">
											<input class="form-control" type="text" id="title"
												name="title" placeholder="제목">
										</div> <br></li>

									<li class="boardElement"><span>대표이미지 등록</span> 
									<div class="form-group uploadDiv">

									<input
										type="file" name="uploadFile" value="등록하기" multiple>
										<div class='uploadResult'>
											<ul class="space">
											</ul>
										</div></div></li>
								</ul>

								<textarea class="form-control" name="contents" id="contents"
									rows="20" cols="100" placeholder="내용을 입력하세요."></textarea>
								<!-- <div id="b_contents" >DragZone</div> -->
								<br>

								<!-- 글 작성폼 하단 -->
								<div class="boardElement">
									<label>공개범위</label> <select class="form-control"
										id="public_check" name="public_check">
										<option value='y'>전체공개</option>
										<option value='n'>비공개</option>
									</select> <label><input type="checkbox" id="fix_flag_check"
										name="fix_flag_check" value='y'>상단고정</label>
								</div>
								<button type="submit" id="boardBtn" name="board"
									class="btn board-form-btn pull-right">게시글등록</button>
							</form>

						</div>
						<!--  end panel-body -->
					</div>
					<!-- end panel -->
				</div>
			</div>
		</div>
	</div>

</body>
</html>