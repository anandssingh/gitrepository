<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
home
<br>
<jsp:scriptlet>
            String[] windows = new String[]{"Windows XP", "Windows 7", "Windows 8", "Windows mobile"};
            pageContext.setAttribute("windows", windows);
        </jsp:scriptlet>

        <%-- JSTL foreach tag example to loop an array in jsp --%>
        <c:forEach var="window" items="${pageScope.windows}"> 
            <c:out value="${window}"/> 
        </c:forEach>
<br>


<c:forEach var="window" items="${requestScope.spittles}"> 
            <c:out value="${window}"/> 
        </c:forEach>

</body>
</html>