<%--
  Created by IntelliJ IDEA.
  User: felopater.sadek_maxa
  Date: 10/15/2025
  Time: 12:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Registration Form</title>
	<style>
        body {
            font-family: Arial, sans-serif;
            background: #f9f9f9;
        }
        .form-container {
            width: 350px;
            background: white;
            padding: 20px;
            margin: 40px auto;
            border-radius: 8px;
            box-shadow: 0 0 5px rgba(0,0,0,0.2);
        }
        input[type=text], input[type=password], select {
            width: 100%;
            padding: 8px;
            margin-top: 6px;
            margin-bottom: 10px;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        .btn {
            background-color: #e74c3c;
            color: white;
            padding: 10px 20px;
            border: none;
            width: 100%;
            border-radius: 4px;
            cursor: pointer;
        }
        .btn:hover {
            background-color: #c0392b;
        }
	</style>
</head>
<body>
<div class="form-container">
	<form:form action="result" method="post" modelAttribute="userForm">

		<form:input path="username" placeholder="Username" />
		<form:password path="password" placeholder="Password" />

		<form:select path="country">
			<form:option value="">Select Country</form:option>
			<form:option value="Brazil">Brazil</form:option>
			<form:option value="Egypt">Egypt</form:option>
			<form:option value="USA">USA</form:option>
		</form:select>

		<p>Preferred Programming Language</p>
		<form:radiobutton path="preferredLanguage" value="Java"/> Java
		<form:radiobutton path="preferredLanguage" value="C#"/> C#
		<form:radiobutton path="preferredLanguage" value="PHP"/> PHP
		<form:radiobutton path="preferredLanguage" value="Ruby"/> Ruby

		<p>Preferred Operating System</p>
		<form:checkbox path="operatingSystems" value="Linux"/> Linux
		<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS
		<form:checkbox path="operatingSystems" value="MS Windows"/> MS Windows

		<br/><br/>
		<input type="submit" value="Submit" class="btn"/>

	</form:form>
</div>
</body>
</html>

