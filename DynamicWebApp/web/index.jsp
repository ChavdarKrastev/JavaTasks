<%-- 
    Document   : index
    Created on : Nov 19, 2016, 11:14:29 PM
    Author     : user1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        </style>
</head>
<body>

<form action="GetPersonInfo" method="processRequest"> 
personID: <input name="personID">  
<input type="submit" value="Find"></p>
</form> 
    
    <%
    Object value = request.getAttribute("firstName");
%>
<p><%=value%></p>

<%
    Object value2 = request.getAttribute("lastName");
%>
<p><%=value2%></p>

<%
    Object value3 = request.getAttribute("birthDate");
    %>
<p><%=value3%></p>
    
    </body>
</html>
