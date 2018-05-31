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

	<a href="<s:url action='ProductDetailsAction'><s:param name="productId" value="productId" /></s:url>">
	<img src="<s:property value='imageFilePath'/>" alt="Photo" width="250" height="220"></a>

	<s:property value="releaseCompany"/>


</s:iterator>





<jsp:include page="include_footer.jsp"/>

</body>
</html>