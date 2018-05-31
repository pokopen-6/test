<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<link rel="stylesheet" href="./css/wheels.css">
<title>wheels/ホーム</title>

</head>
<body>

	<div class="main">
	<div class="container">
	<jsp:include page="include_header.jsp" />



		<h2><a href='<s:url action="ProductListAction"/>'>商品一覧</a></h2>


</div>
</div>



<jsp:include page="include_footer.jsp"/>
</body>
</html>