<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 14.05.2022
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index</title>
    <meta charset="UTF-8">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Flex:opsz,wght@8..144,100;8..144,300;8..144,500;8..144,700;8..144,900;8..144,1000&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto Flex', sans-serif;
        }

        .main-container {
            margin: 5rem;
            padding: 2rem;
            text-align: center;
        }

        .main-container h1 {
            font-weight: 100;
            font-size: 2rem;
        }

        .next-page {
            text-align: center;
            color: green;
        }

    </style>
</head>
<body>

    <main>
        <div class="main-container">
            <div class="title">
                <h1>Hello simple Spring web MVC application</h1>
            </div>
            <div>
                <img src="https://upload.wikimedia.org/wikipedia/uk/7/70/Spring_Framework.png">
            </div>
        </div>

        <div class="next-page">
            <a href="second-page">second page</a>
        </div>
    </main>

</body>
</html>
