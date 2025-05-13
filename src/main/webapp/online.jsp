<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Thời gian bạn đã online: <c:out value="${sessionScope.onlineTime}"/> giây</h2>

    <c:if test="${sessionScope.onlineTime > 60}">
        <p style="color: red;">Bạn đã ở đây hơn 1 phút rồi đó!</p>
    </c:if>
</body>
</html>