<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>商品一覧</title>
<style type="text/css">
	body {
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:18px;
		color:#333;
		background:#fff;
		}
	main {
		width:100%;
		}
	table {
		text-aign:center;
		margin:0 auto;


			}

		#pp {
			text-align:center;
			}
	#top {
		width:400px;
		margin:30px;
		border:1px solid #333;
		text-align:center;
		}
	#header {
		width:100%;
		height:80px;
		background-color:black;
		text-align:center;
		}
	#x {
		float:left;
		clear:both;
		margin-left:15px;
			}
	#image {

		}

	#itemList {
		foloat:left;
		}

</style>
</head>
<body>
	<h1>エラーが発生しました。</h1>

	<h2>お手数ですが始めからやり直してください。</h2>

	<p><a href='<s:url action="GoBuyItemAction" />'>製品一覧</a>はこちら<br>
		<a href='<s:url action="GoHomeAction" />'>ホーム</a>はこちら</p>

</body>
</html>