<%--
  Created by IntelliJ IDEA.
  User: felopater.sadek_maxa
  Date: 10/8/2025
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Student Data</title>

	<style>
        body {
            margin: 0;
        }

        #parent {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
            background-color: #005cbf;
            margin: 0;
        }

        #parent h1 {
            color: white;
        }

        #parent h3 {
            color: white;
        }
	</style>
</head>
<body>

<div id="parent">

	<h1>Student Data</h1>

	<h3>First Name: ${student.firstName}, Last Name:${student.lastName}, E-mail: ${student.email}, Data of Birth: ${student.dateOdBirthday}, City: ${student.city}</h3>
</div>

</body>
</html>
