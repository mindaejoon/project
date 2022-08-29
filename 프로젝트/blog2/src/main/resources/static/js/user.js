let index={
	init: function(){
		$("#btn-save").on("click",()=>{
			this.save();
		});
		
		$("#btn-update").on("click",()=>{
			this.update();
		});
		
		$("#btn-findId").on("click",()=>{
			this.find();
		});
		
		$("#btn-findpwd").on("click",()=>{
			this.findpwd();
		});
		
		$("#btn-delete").on("click",()=>{
			this.delete();
		});
		
	
		/*
		$("#btn-login").on("click",()=>{
			this.login();
		});
	*/
	},
	
	delete: function(){
		var id=$("#id").val();
		
		$.ajax({
			type:"DELETE",
			url:"/user/updateForm/"+id,
			dataType:"json"
		}).done(function(resp){
			alert("탈퇴 완료");
			
			location.href="/logout";
			
		}).fail(function(error){
			alert(JSON.stringify(error));
		});
	},
	
	findpwd: function(){
		var pwd = $("#pwd").val();
		var pwdc = $("#pwd_check").val();
		if(pwd == pwdc){
		let data={
			username: $("#username").val(),
			name: $("#name").val(),
			email: $("#email").val(),
			tel: $("#tel").val(),
			password: pwd
		};
		
		$.ajax({
			type:"POST",
			url:"/auth/findpwd",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
				alert(resp.data);
				if(resp.status !=500){
				location.href="/auth/loginForm";
				}
		}).fail(function(error){
				alert(error.data);
				
		});
		}else {
			alert("비밀번호가 다릅니다.");
		}
	},
	
	
	find: function(){
		let data={
			email: $("#email").val()
			
		};
		$.ajax({
			type:"POST",
			url:"/auth/findId",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			if(resp.status !=500){
			alert("사용자의 아이디는 "+resp.data+"입니다. ");
			location.href="/";}else{
				alert("사용자의 이메일을 잘못입력하셨습니다.")
			}
		}).fail(function(error){
			alert("존재하지 않은 회원입니다.");
		});
	},
	
	save: function(){
		let data={
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val(),
			address: $("#address").val(),
			name: $("#name").val(),
			tel: $("#tel").val()
		};
		$.ajax({
			type:"POST",
			url:"/auth/joinProc",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("회원가입이 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert("회원가입에 실패하였습니다.(사유:이미 가입된 아이디 혹은 이메일 입니다)");
		});
	},
	
	update: function(){
		let data={
			id: $("#id").val(),
			password: $("#password").val(),
			email: $("#email").val(),
			tel: $("#tel").val(),
			address: $("#address").val()
		};
		$.ajax({
			type:"PUT",
			url:"/user",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("회원수정이 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert("올바르지 않은 형식입니다.");
		});
	}
	/*
	login: function(){
		let data={
			username: $("#username").val(),
			password: $("#password").val()
		};
		
		$.ajax({
			
			type:"POST",
			url:"/api/user/login",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json"
		}).done(function(resp){
			alert("로그인이 완료되었습니다.");
			location.href="/";
		}).fail(function(error){
			alert(JSON.stringify(error));
	});
}*/
}
index.init();