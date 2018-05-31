<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>


<style>
header {
	width:100%;
	height:50px;
	color:white;
	font-size:15px;
	font-family:arial black,Helvetica,sans-serif;
	background:linear-gradient(to bottom,#66CCFF,rgba(0,0,0,0.1));
		}
ul li {
	float:left;
	color:white;

	font-weight:border;
	margin-left:15px;
	list-style-type:none;
	margin-right:25px;

	}
a {
	color:#FFD700;
	text-decoration:none;
	font-size:15px;
	}


</style>

<header>
<ul class="ul"><s:if test="#session.loginFlg">
	<li class="li"><a href='<s:url action="LogoutAction"/>'>ログアウト</a></li><li>|</li>
	<li class="li"><a href='<s:url action="GoMyPageAction"/>'>マイページ</a></li><li>|</li>


</s:if><s:else>
	<li class="li"><a href='<s:url action="LoginAction"/>'>ログイン</a></li><li>|</li>
</s:else>
	<li class="li"><a href='<s:url action="CompanyAction"/>'>about ＷＯＯＤ</a></li>

</ul>

</header>

