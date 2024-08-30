<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style type="text/css">
body{
 
  font-size: 40px;
  text-align:center;
  background: linear-gradient(to right,  #2b40ff,#07121a);
  border: 20px;
}

h1{
text-decoration: underline;
text-align:center;


}
input, button {
  font-size:35px;
  color: white;
  border-radius: 10px;
  background-color: black;
  border: 2px solid white;
  justify-content: center;
  padding: 10px;
}



</style>
<body>
<h1>Answer=<%=request.getParameter("ans")%>🚩</h1>
</body>
</html>