<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>WebContent/member/list.jsp</h1>
   <h2> 회원 목록 (관리자 전용) </h2>
   <table border="1">
     <tr>
       <td>이름</td>
       <td>제목</td>
       <td>내용</td>
     </tr>
     <c:forEach items="${boardList}" var="list">
     <tr>
        <td>${list.name}</td>
        <td><a href="/myapp/board/read?num=${list.num}">${list.subject}</a></td>
        <td>${list.content}</td>
     </tr>
     </c:forEach>
   </table>
</body>
</html>