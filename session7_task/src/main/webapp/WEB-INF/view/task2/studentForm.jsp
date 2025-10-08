<%--
  Created by IntelliJ IDEA.
  User: felopater.sadek_maxa
  Date: 10/8/2025
  Time: 1:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Student Form</title>

	<style>

		body {
			width: 100%;
			height: 100%;
			background-color: #005cbf;
            align-items: center;
			justify-content: center;
			display: flex;
		}

		.parent  {
			display: flex;
			flex-direction: column;
			justify-content: center;
			align-items: start;
		}

		form {
            display: flex;
            flex-direction: column;
		}

		form h3 {
			color: white;
		}

        form input {
            border-radius: 10px;
            outline: none;
            border: none;
            padding: 8px;
        }

        .btnSubmit {
            background-color: #dee2e6;
            color: #005cbf;
            border-radius: 10px;
	        margin-top: 10px;
        }

        .btnSubmit:hover {
            background-color: #115cbf;
            color: #dee2e6;
        }

	</style>

</head>
<body>

	<div class="parent">

		<form action="form-data">

			<h3>First Name</h3>
			<input name="txtFirstName" placeholder="First Name">

			<h3>Last Name</h3>
			<input name="txtLastName" placeholder="Last Name">

			<h3>Email</h3>
			<input name="txtEmail" placeholder="Email">

			<h3>Date of Birth</h3>
			<input name="txtBirthday" placeholder="DD-MM-YYYY">

			<h3>City</h3>
			<input name="txtCity" placeholder="City">

			<input type="submit" class="btnSubmit">
		</form>

	</div>

</body>
</html>
