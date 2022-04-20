var xhr; //XMLHttpRequest객체를 저장할 변수를 전역변수로 선언
window.onload= function(){ 
	xhr = new XMLHttpRequest();
}

function startMethod(){
	var uid = document.getElementById("userid").value;  
    var upwd = document.getElementById("userpwd").value; 
    console.log(uid);
    console.log(upwd);
    var url = "login.jsp";
    xhr.onreadystatechange = resultProcess; 
    xhr.open("POST",url,  true );
    xhr.setRequestHeader("Content-type", 
                            "application/x-www-form-urlencoded"); 
    xhr.send("userid="+uid+"&userpwd="+upwd);//서버로 요청을 보냄               
}

function resultProcess(){
	if(xhr.readyState == 4){//요청객체의 상태가 모든 데이터를 받을 수 있는 상태로 완료된 경우
		if(xhr.status == 200){//서버로부터 응답받는 HTTP상태가 정상인 경우 수행
		   console.log(xhr.responseXML);
		   var result =	xhr.responseXML.getElementsByTagName("result")[0].firstChild.data;
		   var name = xhr.responseXML.getElementsByTagName("id")[0].firstChild.data;
		   if (result == 1){//사용자 인증성공시
		      var str="<table><tr><td align='center'><b>"
		          str+=name+"</b> 님 오셨구려..</td></tr>"
		          str+="<tr><td align='center'>"
		          str+="<input type='button' id='logout' value='로그아웃' />"
		          str+="</td></tr></table>"
		       document.getElementById("confirmed").innerHTML = str;        
			}else if(result==2){
			  alert("비밀번호가 맞지 않습니다.\n다시 입력해 주시기 바랍니다.");
      		  document.getElementById("userid").value=name;
      		  document.getElementById("userpwd").value="";
      		  document.getElementById("userpwd").focus();
			}else if(result==3){
			  alert("아이디가 맞지 않습니다.\n다시 입력해 주시기 바랍니다.");
      		  document.getElementById("userid").value=name;
      		  document.getElementById("userpwd").value="";
      		  document.getElementById("userid").focus();
			}
			   
		}
	}
}
	