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