<!DOCTYPE html>
<html style="background-color:#FABE28">
<!-- #00C176 -->
<head>
    <title><#if version??>V${version}</#if></title>
</head>
<body style="align-items:center;justify-content:center;color:#000000;font-family:sans-serif;font-size:6rem;margin:0;letter-spacing:-0.1em">
<h2 style="text-align: center">Online Store <#if version??>V${version}</#if></h2>
<h3 style="text-align: center; color: #0027FA">Products Service <#if productsService??>${productsService}<#else>N/A</#if></h3>
<h3 style="text-align: center; color: #FA00EF">Customers Service <#if customersService??>${customersService}<#else>N/A</#if></h3>
</body>
</html>



