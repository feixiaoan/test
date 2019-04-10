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
            width: 100%;
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
        <table>
            <thead>
                <tr>
                    <th>学号</th>
                    <th>名字</th>
                    <th>密码</th>
                    <th>性别</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${studentList}" var="student">
                    <tr>
                        <td>${student.studentNumber}</td>
                        <td>${student.studentName}</td>
                        <td>${student.studentPassword}</td>
                        <td>
                            <c:choose>
                                <c:when test="${student.studentSex == 0}">女</c:when>
                                <c:when test="${student.studentSex == 1}">男</c:when>
                            </c:choose>
                        </td>
                        <td>
                            <a href="/updateStudent?studentId=${student.studentId}">更新</a>
                            <a href="/deleteStudent?studentId=${student.studentId}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>