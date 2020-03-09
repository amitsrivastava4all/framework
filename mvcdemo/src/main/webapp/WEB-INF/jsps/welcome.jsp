<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Page ${msg}</h1>
<form action="login4" method="post" >
<input name="uid"   type='text' placeholder="Type Userid Here"/>
<br/>
<input name="pwd"  type='password' placeholder="Type Password Here"/>
<br/>
<button>Login</button>
</form>
<%-- <form:form action="login2" method="post" modelAttribute="usermodel">
<form:input name="uid" path="uid"  type='text' placeholder="Type Userid Here"/>
<br/>
<form:input name="pwd" path="pwd" type='password' placeholder="Type Password Here"/>
<br/>
<form:button>Login</form:button>
</form:form> --%>
<!-- <form action="login" method="post">
<input name="uid" type='text' placeholder="Type Userid Here"/>
<br/>
<input name="pwd" type='password' placeholder="Type Password Here"/>
<br/>
<button>Login</button>
</form> -->
</body>
</html>