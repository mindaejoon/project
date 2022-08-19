let index={
	init: function(){
		$("#btn-save").on("click",()=>{
			this.save();
		});
		
		$("#btn-update").on("click",()=>{
			this.update();
		});
		/*
		$("#btn-login").on("click",()=>{
			this.login();
		});
	*/
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
			alert(JSON.stringify(error));
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
			alert(JSON.stringify(error));
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