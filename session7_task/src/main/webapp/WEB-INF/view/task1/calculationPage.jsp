<%--
  Created by IntelliJ IDEA.
  User: felopater.sadek_maxa
  Date: 10/8/2025
  Time: 12:43 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<head>
	<title>Calculation</title>

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

	<h1>Calculator App</h1>

	<h3>your age is: ${year} year , ${month} month , ${day} day</h3>
</div>

</body>
</html>
