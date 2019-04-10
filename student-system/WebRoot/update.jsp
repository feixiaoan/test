<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <form action="/updateStudent" method="post">
            <input type="hidden" name="studentId" value="${student.studentId}" />
            学号：<input type="text" name="studentNumber" value="${student.studentNumber}" /><br/>
            姓名：<input type="text" name="studentName" value="${student.studentName}" /><br/>
            密码：<input type="password" name="studentPassword" value="${student.studentPassword}" /><br/>
            性别：
            <c:choose>
                <c:when test="${student.studentSex == 1}">
                    <input name="studentSex" type="radio" value="1" checked /> 男
                    <input name="studentSex" type="radio" value="0" /> 女<br/>
                </c:when>
                <c:when test="${student.studentSex == 0}">
                    <input name="studentSex" type="radio" value="1"  /> 男
                    <input name="studentSex" type="radio" value="0" checked /> 女<br/>
                </c:when>
            </c:choose>
            <button type="submit">更新</button>
        </form>
    </div>
</div>


</body>
</html>
