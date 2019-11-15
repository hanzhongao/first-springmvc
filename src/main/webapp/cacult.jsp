<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/bmi/bmi1" method="post">
    <fieldset>
        <legend class="text-center text-primary">计算BMI身体指数</legend>
        <div>
            <label>身高:</label>
            <input type="text" name="hight" placeholder="请输入身高">cm
        </div>
        <div>
            <label>体重:</label>
            <input type="text" name="weight" placeholder="请输入体重"/>kg
        </div>
        <div>
            <button type="submit">提交测试</button>
        </div>
    </fieldset>
</form>
</body>
</html>
