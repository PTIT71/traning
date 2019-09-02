<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.6.2.js"></script>
 <script language="JavaScript">
  var request;
   
  function getDataAutoFill(url,paramId,showId) {
	var param = document.getElementById(paramId).value;
    var url = url + ".do?getdata=" + param;
   
    // Perform the AJAX request using a non-IE browser.
    if (window.XMLHttpRequest) {
      request = new XMLHttpRequest();
   
      // Register callback function that will be called when
      // the response is generated from the server.
      request.onreadystatechange = function() {
    	  if (request.readyState == 4) {
    	      if (request.status == 200) {
    	        var count = request.responseText;
    	   
    	        document.getElementById(showId).value = count;
    	      } else {
    	        alert("Unable to retrieve count from server.");
    	      }
    	    } 
      };
   
      try {
      request.open("POST", url, true);
      } catch (e) {
         alert("Unable to connect to server to retrieve count.");
      }
   
      request.send();
    // Perform the AJAX request using an IE browser.
    } else if (window.ActiveXObject) {
      request = new ActiveXObject("Microsoft.XMLHTTP");
   
      if (request) {
        // Register callback function that will be called when
        // the response is generated from the server.
        request.onreadystatechange = updateCount;
   
        request.open("GET", url, true);
        request.send();
      }
    }
  }
   
  // Callback function to update page with count retrieved from server.
  function updateCount() {
   
  }
</script>

</head>
<body>
 <html:form action="search">
	        <table>
	            <tr>
	                <td>DPT</td>
	                <td><html:text onchange="getDataAutoFill('/Traning/getDPT','dpt','dptname');" styleId="dpt" property="idCode"></html:text></td>
	                <td>Name DPT</td>
	                <td><html:text  styleId="dptname" property="idName"></html:text></td>
	            </tr>
	            <tr>
	                  <td>Supplier</td>
	                <td><html:text onchange="getDataAutoFill('/Traning/getSupplider','supplier','suppliername');" styleId="supplier" property="idCode"></html:text></td>
	                <td>Name Supplier</td>
	                <td><html:text  styleId="suppliername" property="idName"></html:text></td>
	            </tr>
	        </table>
	        <div class="submit-login">
	        	 <html:submit value="Search" />
	        
	        </div>
	    </html:form>
	    
</body>
</html>