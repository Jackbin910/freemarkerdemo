<html>
<head>
    <meta charset="UTF-8">
    <title>学生信息</title>
</head>
<body>
    ${date?date}&nbsp;&nbsp;${date?time}&nbsp;&nbsp;${date?datetime}
<table border="1" cellpadding="0" cellspacing="0">
    <tr>
        <td>编号</td>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>住址</td>
    </tr>
    <#list stulist as stu>
    <tr>
        <td>${stu_index}</td>
        <td>${stu.id}</td>
        <td>${stu.name}</td>
        <td>${stu.age}</td>
        <td>${stu.address}</td>
    </tr>
    </#list>
</table>
</body>
</html>