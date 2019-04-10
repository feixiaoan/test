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
        相关技术：jsp + servlet + JDBC + mysql<br/>
        实现功能：增删改查<br/>
        Java自学网：<a target="_blank" href="http://www.tangcoding.cn">http://www.tangcoding.cn</a><br/>
        QQ交流群：957406675
    </div>
</div>
</body>
</html>