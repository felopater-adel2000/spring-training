<%--
  Created by IntelliJ IDEA.
  User: felopater.sadek_maxa
  Date: 10/15/2025
  Time: 12:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
	<title>Form Result</title>
	<style>
        body {
            font-family: Arial, sans-serif;
            background: #f9f9f9;
        }
        .result-container {
            width: 400px;
            margin: 50px auto;
            background: white;
            border-radius: 10px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.2);
            padding: 20px;
        }
        h2 {
            color: #333;
            text-align: center;
            margin-bottom: 20px;
        }
        .info {
            margin-bottom: 10px;
            font-size: 16px;
        }
        .label {
            font-weight: bold;
            color: #555;
        }
        .value {
            color: #222;
        }
        .btn-back {
            display: block;
            background-color: #e74c3c;
            color: white;
            border: none;
            padding: 10px 20px;
            text-align: center;
            margin: 20px auto 0;
            border-radius: 4px;
            text-decoration: none;
            width: 100%;
        }
        .btn-back:hover {
            background-color: #c0392b;
        }
	</style>
</head>
<body>
<div class="result-container">
	<h2>Form Submitted Successfully ✅</h2>

	<div class="info">
		<span class="label">Username:</span>
		<span class="value">${userForm.username}</span>
	</div>

	<div class="info">
		<span class="label">Country:</span>
		<span class="value">${userForm.country}</span>
	</div>

	<div class="info">
		<span class="label">Preferred Programming Language:</span>
		<span class="value">${userForm.preferredLanguage}</span>
	</div>

	<div class="info">
		<span class="label">Preferred Operating Systems:</span>
		<span class="value">
            <c:forEach var="os" items="${userForm.operatingSystems}">
	            ${os}<c:if test="${!fn:endsWith(os, ' ')}"> </c:if>
            </c:forEach>
        </span>
	</div>

	<a href="register" class="btn-back">Back to Form</a>
</div>
</body>
</html>

