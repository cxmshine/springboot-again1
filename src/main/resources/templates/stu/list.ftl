<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生列表</title>
</head>
<body>
欢迎回来 , ${user}
<#if (age<18)> 小年轻
    <#elseif (age>30) > 大叔
    <#else > 帅哥/美女
</#if>
<br/>
学生列表<br>
<table border="1">
    <tr>
        <td>ID</td>
        <td>名字</td>
        <td>性别</td>
    </tr>

    <#list stuList?sort_by("id")?reverse as stu>
        <tr>
            <td>${stu.id}</td>
            <td>${stu.username}</td>
            <td>${stu.gender}</td>
        </tr>
    </#list>

</table></br>
${student.id} | ${student.username} | ${student.gender}
</body>
</html>