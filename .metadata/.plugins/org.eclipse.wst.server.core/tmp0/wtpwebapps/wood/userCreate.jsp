<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-type" content="text/javascipt"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>ユーザー登録画面</title>
<style type="text/css">
	body {
		margin:0;
		padding:0;
		line-height:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:12px;
		color:#333;
		background:#fff;
		}
	table {
		text-align:center;
		margin:0;
		}
	#top {
		width:780px;
		margin:30px auto;
		border:1px solid black;
		}
	#main {
		width:100%;
		height:500px;
		text-align:center;
		}
	#footer {
		width:100%;
		height:80px;
		background-color:black;
		clear:black;
		}

</style>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreate</p>
		</div>
		<div>
			<s:if test="errorMessage !=''">
				<s:property value="errorMessage" escape="false"/>
			</s:if>
			<table>
			<s:form action="UserCreateConfirmAction">
			<tr>
				<td>
					<label>ユーザーID</label>
				</td>
				<td>
					<input type="text" name="loginUserId" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>パスワード</label>
				</td>
				<td>
					<input type="text" name="loginPassword" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>お名前（姓）</label>
				</td>
				<td>
					<input type="text" name="familyName" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>お名前（名）</label>
				</td>
				<td>
					<input type="text" name="firstName" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>ふりがな（姓）</label>
				</td>
				<td>
					<input type="text" name="familyNameKana" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>ふりがな（名）</label>
				</td>
				<td>
					<input type="text" name="firstNameKana" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>性別</label>
				</td>
				<td>
					<input type="radio" name="sex" value="0" checked="checked">：男　性
					<input type="radio" name="sex" value="1">：女　性
				</td>
			</tr>
			<tr>
				<td>
					<label>メールアドレス</label>
				</td>
				<td>
					<input type="text" name="userMail" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>お電話番号</label>
				</td>
				<td>
					<input type="text" name="userTel" value=""/>
				</td>
			</tr>
			<tr>
				<td>
					<label>郵便番号</label>
				</td>
				<td>
					<input type="text" name="postalCode" value="" maxlength='8'/>
				</td>
			</tr>
			<tr>
				<td>
					<label>住所</label>
				</td>
				<td>
					<input type="text" name="userAddress" value=""/>
				</td>
			</tr>
			<s:submit value="登録"/>
			</s:form>
			</table>
			<div>
				<span>HOMEに戻る場合は</span><a href='<s:url action="GoHomeAction"/>'>こちら</a>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>


</body>
</html>