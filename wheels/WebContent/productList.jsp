<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧</title>
</head>
<body>

<jsp:include page="include_header.jsp"/>


<s:iterator value="#session.ProductList">

	<s:property value="productName"/>


</s:iterator>





<jsp:include page="include_footer.jsp"/>

</body>
</html>