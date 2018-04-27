<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<link rel="stylesheet" href="./css/home.css">
<title>wood/ホーム</title>

<style type="text/css">


/* body{
background-image:url("./images/haikei.jpg");
}
 */


</style>

</head>
<body>
	<jsp:include page="include_header.jsp" />

		<ul class="ul"><s:if test="#session.loginFlg">
	<li class="li"><a href='<s:url action="GoBuyItemAction"/>'>商品一覧</a></li>



</s:if><s:else>
	<li class="li"><a href='<s:url action="LoginAction"/>'>商品一覧</a></li>
</s:else></ul>

<jsp:include page="include_footer.jsp"/>
</body>
</html>