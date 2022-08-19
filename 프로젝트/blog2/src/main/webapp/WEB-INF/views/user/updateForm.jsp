<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../layout/header.jsp" %>
<div class="container">
	<form>
		<input type="hidden" id="id" value="${principal.user.id}"/>
		<div class="form-group">
			<label for="username">아이디</label><input type="text" value="${principal.user.username }"
					class="form-control" placeholder="Enter Username" id ="username" readonly>
		</div>
		<div class="form-group">
			<label for="email">이메일</label><input type="email" value="${principal.user.email }"
					class="form-control" placeholder="Enter email" id ="email" >
		</div>
		<div class="form-group">
			<label for="pwd">비밀번호</label><input type="password" 
					class="form-control" placeholder="Enter password" id ="password" >
		</div>
		<div class="form-group">
			<label for="tel">전화번호</label><input type="tel" 
					class="form-control" placeholder="Enter phone number" id ="tel" >
		</div>
		<div class="form-group">
			<label for="address">주소</label><input type="text" 
					class="form-control" placeholder="Enter address" id ="address" >
		</div>
	</form>
	<button id="btn-update" class="btn btn-primary">회원수정완료</button>
	</div>
<script src="/js/user.js"></script>
<br/> 		
<%@ include file="../layout/footer.jsp"%>