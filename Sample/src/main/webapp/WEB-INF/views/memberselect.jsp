<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table>
        <tr>
            <th align="center" bgcolor="white" width="200">이름</th>
            <th align="center" bgcolor="white" width="100">나이</th>
            <th align="center" bgcolor="white" width="150">직업</th>
         </tr>
         <c:forEach items="${list}" var="list">
            <!-- 프라퍼티이름 변경 -->
         	<tr>
               <td align="center">${list.name}</td>
               <td align="center">${list.age}</td>
               <td align="center">${list.job}</td>   
            </tr>
         </c:forEach>
         </table>
</body>
</html>