<b>hi from empty template</b>

<#assign foo="bar">

Wartosc zmiennej: ${foo}
<br/>
<#assign foo="another bar">
Kolejny raz sie odwoluje: ${foo}!!!

<#assign x = 5..8>

<#list x as i>
    ${i}<br/>
</#list>

<#macro hello name fontSize>
  <font size="${fontSize}">Hello ${name}</font><br/>
</#macro>

<@hello name="Michal" fontSize="1"/>
<@hello name="Michal" fontSize="3"/>
<@hello name="Michal" fontSize="7"/>

<#include "footer.ftlh">