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

<#include "footer.ftlh">