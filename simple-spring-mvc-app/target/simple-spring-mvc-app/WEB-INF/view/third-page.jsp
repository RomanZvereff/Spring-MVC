<%--
  Created by IntelliJ IDEA.
  User: roman
  Date: 15.05.2022
  Time: 17:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Page</title>
</head>
<body>

    <main>
        <div class="main-container">
            <div class="title">
                <h1>Hello friend</h1>
            </div>
            <div>
                <form action="result" method="POST">
                    <label>Name: </label>
                    <input type="text" name="userName" placeholder="Enter your name">
                    <button type="submit">Send</button>
                </form>
            </div>
        </div>
    </main>

</body>
</html>
