<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/login" method="post">
        <fieldset>
            <legend class="text-center text-primary">用户注册页面</legend>
            <div>
                <label>用户名:</label>
                <input type="text" name="username" placeholder="请输入用户名"/>
            </div>
            <div>
                <label>密码:</label>
                <input type="password" name="password" placeholder="请输入密码"/>
            </div>
            <div>
                <button type="submit">登录</button>
            </div>
        </fieldset>
    </form>
</body>
</html>
