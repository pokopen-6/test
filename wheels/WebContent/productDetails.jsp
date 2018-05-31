<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品詳細画面</title>
</head>
<body>
<jsp:include page="include_header.jsp"/>


<form action="BuyItemAction">
<img src="<s:property value='#session.DetailProductDTO.imageFilePath'/>" alt="photo" width="500" height="450">
<table>
<tr>
<td>
<span>製品名：<s:property value="#session.DetailProductDTO.productName"/><br></span>

<span>メーカー：<s:property value="#session.DetailProductDTO.releaseCompany"/><br></span>
<span>価格：<s:property value="#session.DetailProductDTO.price"/><br></span>
<span>製品詳細：<s:property value="#session.DetailProductDTO.productDescription"/><br></span>
</td>

</table>
<input type="submit" value="購入画面へ">
</form>



<jsp:include page="include_footer.jsp"/>
</body>
</html>