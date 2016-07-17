<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Welcome</title>
</head>
<link href="../css/login.css" rel="stylesheet" type="text/css">
<body>
	<form:form id="loginForm" method="post" action="submitLogin.do"
		modelAttribute="user">
		<div class="outerLoginDiv">
			<div class="loginDiv" align="center">
				User Name:
				<form:input id="userName" name="userName" path="userName" />
				Password:
				<form:password id="password" name="password" path="password" />
				<br> <br> <br> <input type="submit" value="Submit">
			</div>
		</div>
	</form:form>
</body>
</html>