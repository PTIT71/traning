<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ page import="com.training.utils.common" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ĐĂNG NHẬP</title>
<link rel="stylesheet" type="text/css" href="styles/mainStyle.css">
<script type="text/javascript">
window.onload = function() {
   if("${isInvalidPassword}" == "RIGHT")
   {
	  var txtPassword = document.getElementById('password');
	  txtPassword.style.backgroundColor = "red";
	  txtPassword.focus();
   }
   if("${isInvalidUser}" == "RIGHT")
   {
	  var txtUser = document.getElementById('userId');
	  txtUser.style.backgroundColor = "red";
	  txtUser.focus();
   }
  
};
</script>
</head>
<body>
	<div class=header>
		<div class="title-header">
			<label>Màn hình đăng nhập</label>
		</div>
		<div class="currentDate-header">
			<label><%=common.getCurrentDateTime()%></label>
		</div>
	</div>
	<div class="content">
		 <html:form action="login">
	        <table>
	            <tr>
	                <td class="title-table">ID</td>
	                <td><html:text styleId="userId" property="userId"></html:text></td>
	            </tr>
	            <tr>
	                <td class="title-table">Mật khẩu</td>
	                <td><html:text styleId="password" property="password"></html:text></td>
	            </tr>
	        </table>
	        <div class="submit-login">
	        	 <html:submit value="Đăng Nhập" />
	        	 <html:button property="btnExit" onclick="top.windows.close()">Thoát</html:button>
	        </div>
	    </html:form>
	</div>
	<div class="message">
	    <bean:message key="welcome"/>
		<html:errors property="userId" />
		<html:errors property="password" />
	</div>

</body>
</html>