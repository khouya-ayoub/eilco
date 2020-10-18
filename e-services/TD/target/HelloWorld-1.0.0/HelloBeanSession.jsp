<%@ page import="java.util.Collection" %>
<%@ page import="beans.HelloBean" %>
<%@ page import="java.util.Iterator" %>

<%--
  Created by IntelliJ IDEA.
  User: AYOUB
  Date: 30/09/2020
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Avec Scriplet</title>
</head>
<body>
    <br/>
    <%
        Collection<HelloBean> beanHello = (Collection<HelloBean>) session.getAttribute("beanHello");
        if (beanHello != null) {
            Iterator<HelloBean> it = beanHello.iterator();
            while (it.hasNext()) {
                HelloBean aBean = it.next();
    %>
    Bonjour <%= aBean.getNom() %>
    <%
            }
        }
    %>

    <br/>
    Utilisation de EL
    <c:forEach var="aBean" items="${beanHello}">
        Test ${aBean.nom} <br/>
    </c:forEach>

</body>
</html>
