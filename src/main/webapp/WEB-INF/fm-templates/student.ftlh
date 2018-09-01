<html>
<head>
    <title>Student</title>
</head>
<body>
<h2>First name: ${student.firstName}</h2>
<h2>Last name: ${student.lastName}</h2>

<h2>Grades:
  <#list student.grades as g>
      ${g}<#sep>, </#sep>
  <#else>
    NO GRADES
  </#list>
</h2>

<h2>
  <#if student.active>
      <span style="color: #00FF00; ">ACTIVE</span>
  <#else>
    <span style="color: #FF0000; ">INACTIVE</span>
  </#if>
</h2>

</body>
</html>