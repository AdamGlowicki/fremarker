<html>
<head>
    <title>Students</title>
</head>
<body>

<#--<ul>-->
<#--<#list students as student>-->
<#--<li>-->
<#--<a href="student?id=${student.id}">-->
<#--${student.firstName} ${student.lastName}-->
<#--</a>-->
<#--</li>-->
<#--</#list>-->
<#--</ul>-->

<table border="1">
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th></th>
    </tr>

  <#list students as s>
    <tr>
        <td>${s.firstName}</td>
        <td>${s.lastName}</td>
        <td><a href="student?id=${s.id}"></a></td>
    </tr>
  </#list>
</table>

<#include "footer.ftlh">
</body>
</html>