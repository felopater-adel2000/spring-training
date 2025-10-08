<html>

<head>
	<title>Birthday</title>

	<link rel="stylesheet" type="text/css" href="../../../resources/css/bootstrap.main.css"/>

	<style>

		#parent {
			width: 100%;
			height: 100%;
			align-items: center;
			display: flex;
			justify-content: center;
		}

		.form {
            width: 100%;
            height: 100%;
            align-items: center;
			background-color: #005cbf;
            display: flex;
            justify-content: center;
		}

		.form input {
			margin: 0 10px;
			border-radius: 10px;
			outline: none;
			border: none;
			padding: 8px;
		}

		.btnSubmit {
			background-color: #dee2e6;
			color: #005cbf;
            border-radius: 10px;
		}

		.btnSubmit:hover {
            background-color: #115cbf;
			color: #dee2e6;
		}

	</style>

</head>

<body>

<div class="input-group mb-3" id="parent">

	<form action="calculation" class="form">

		<input class="form-control" type="number" name="txtYear" placeholder="Enter Year">
		<input class="form-control" type="number" name="txtMonth" placeholder="Enter Month">
		<input class="form-control" type="number" name="txtDay" placeholder="Enter day">
		<input type="submit" class="btnSubmit">
	</form>

</div>

</body>

</html>