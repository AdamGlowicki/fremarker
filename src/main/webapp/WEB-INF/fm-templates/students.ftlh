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

Number of students: ${students?size}

<table>
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th></th>
    </tr>

  <#list students as s>
      <#if s?index % 2 == 0>
          <#assign color="#dcdcdc">
      <#else>
          <#assign color="ffffff">
      </#if>
    <tr bgcolor="${color}">
        <td>${s.firstName}</td>
        <td>${s.lastName?upper_case}</td>
        <td><a href="student?id=${s.id}">View</a></td>
    </tr>
  </#list>
</table>

<#include "footer.ftlh">
</body>
</html>