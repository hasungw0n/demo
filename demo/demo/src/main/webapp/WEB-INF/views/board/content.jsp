<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>member/insertForm.jsp</title>
</head>
<body>
<form method="post" action="/myapp/board/insert">
<h1 align="center">회원 가입창</h1>
<table  align="center">
      <tr>
         <td width="200"><p align="right">이름</td>
         <td width="400"><input type="text" name="name" value='${boardContent.name}' readonly></td>
      </tr>
      <tr>
          <td width="200"><p align="right">제목</td>
          <td width="400"><p><input type="text"  name="subject" value='${boardContent.subject}' readonly></td>
      </tr>
      <tr>
          <td width="200"><p align="right">내용</td>
          <td><textarea rows="5" cols="50" name="content" class="form-control" style="width: 75%" readonly>${boardContent.content}</textarea></td>
      </tr>
      <tr>
          <td width="200"><p>&nbsp;</p></td>
          <td width="400">
			<input type="submit" value="작성하기">
			<input type="reset" value="다시입력">
		  </td>
      </tr>
</table>
</form>
</body>
</html>