<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form >
		<div class="form-group">
		<label for="username">아이디</label>
		<input type="text" class="form-control" placeholder="Enter id" id="username">
		</div>
		
		<div class="form-group">
		<label for="pwd">비밀번호</label>
		<input type="password" class="form-control" placeholder="Enter password" id="password">
		</div>
		
		<div class="form-group">
		<label for="name">성함</label>
		<input type="text" class="form-control" placeholder="Enter name" id="name">
		</div>
		
		<div class="form-group">
		<label for="tel">전화번호</label>
		<input type="tel" class="form-control" placeholder="Enter phone number" id="tel">
		</div>
		
		<div class="form-group">
		<label for="email">이메일</label>
		<input type="email" class="form-control" placeholder="Enter email" id="email">
		</div>
		
		<div class="form-group">
		<label for="address">주소</label>
		<input type="text" class="form-control" placeholder="Enter address" id="address">
		</div>

	</form>
<button id="btn-save" class="btn-btn-primary">회원가입</button>
</div>
<script src="/js/user.js"></script>
<br/>
<%@ include file="../layout/footer.jsp"%>