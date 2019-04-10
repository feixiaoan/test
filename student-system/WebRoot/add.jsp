<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>学生管理系统</title>
    <style>
        h1 {
            text-align: center;
            border-bottom: 1px solid black;
            line-height: 100px;
        }

        table {
            border: 1px solid black;
            margin-left: auto;
            margin-right: auto;
            width: 600px;
            text-align: center;
        }

        .content {
            width: 1000px;
            margin-left: auto;
            margin-right: auto;
        }

        .content-left {
            width: 28%;
            border: 1px solid black;
            float: left;
            min-height: 400px;
        }

        .content-right {
            width: 68%;
            border: 1px solid black;
            float: right;
            min-height: 370px;
            padding: 15px;
        }
    </style>
</head>
<body>

<div class="content">
    <h1>学生信息管理系统</h1>
    <div class="content-left">
        <ul>
            <li><a href="/addStudent">新增学生</a></li>
            <li><a href="/studentList">学生列表</a></li>
        </ul>
    </div>
    <div class="content-right">
        <form action="/addStudent" method="post">
            学号：<input type="text" name="studentNumber" value="20181201" /><br/>
            姓名：<input type="text" name="studentName" /><br/>
            密码：<input type="password" name="studentPassword" /><br/>
            性别：<input name="studentSex" type="radio" value="1" checked /> 男
                 <input name="studentSex" type="radio" value="0" /> 女<br/>
            <button type="submit">提交</button>
        </form>
    </div>
</div>


</body>
</html>
