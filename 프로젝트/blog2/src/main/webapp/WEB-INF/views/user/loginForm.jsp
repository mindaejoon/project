<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
    
<div class="container">
	<form action="/auth/loginProc" method="POST">
		<div class="form-group">
			<label for="username">아이디</label>
			<input type="text" class="form-control" placeholder="Enter Username" id="username" name="username">		
		</div>
		<div class="form-group">
			<label for="pwd">비밀번호</label>
			<input type="password" class="form-control" placeholder="Enter password" id="password" name="password">		
		</div>
		<button type="submit" id="btn-login" class="btn btn-primary">로그인</button>	

	</form>
	<button id="btn-fid" class="btn btn-primary">아이디 찾기</button>
	<button id="btn-fpwd" class="btn btn-primary">비밀번호 찾기</button>	
</div>
<!--  <script src="/js/user.js"></script>-->
<br/>
<%@ include file="../layout/footer.jsp"%>