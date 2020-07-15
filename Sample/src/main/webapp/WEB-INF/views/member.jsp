<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="join.do" id = 'aaa'>
		<table>
			<tr>
				<td align="center"><h3>이름</h3></td>
				<td align="center"><h3>나이</h3></td>
				<td align="center"><h3>직업</h3></td>
			</tr>
			<tr>
				<td><input id='id' name='name' type='text' placeholder='이름 입력'/></td>
				<td><input id='age' name='age' type='text' placeholder='나이 입력'/></td>
				<td><input id='job' name='job' type='text' placeholder='직업 입력'/></td>
			</tr>
			<tr>
				<td colspan="3" align="right"><input id='sub' type="submit" value="가입"/></td>
			</tr>
		</table>
	</form>
	
	
<script src="./resources/js/jquery-3.3.1.min.js"></script>	
<script src='./resources/js/js.js'></script>
</body>
</html>