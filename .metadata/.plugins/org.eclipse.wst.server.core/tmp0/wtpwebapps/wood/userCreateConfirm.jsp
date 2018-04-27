<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no"/>
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>ユーザー登録確認画面</title>
<style type="text/css">
	body {
		margin:0;
		padding:0;
		line-hight:1.6;
		letter-spacing:1px;
		font-family:Verdana,Helvetica,sans-serif;
		font-size:12px;
		color:#333;
		background;#fff;
		}
	table{
		text-align:center;
		margin:0 auto;
	}
	#top {
		width:780px;
		margin:30px auto;
		border:1px solid #333;

		}
	#header {
		width:100%;
		height:80px;
		background-color:black;
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
		clear:both;
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
			<p>登録情報確認</p>
		</div>
		<div>
			<h3>登録する内容は以下でよろしいですか。</h3>
			<table>
				<s:form action="UserCreateCompleteAction">
				<tr id="box">
					<td>
						<label>ユーザーID</label>
					</td>
					<td>
						<s:property value="loginUserId" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>ログインパスワード</label>
					</td>
					<td>
						<s:property value="loginPassword" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>お名前（姓）</label>
					</td>
					<td>
						<s:property value="familyName" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>お名前（名）</label>
					</td>
					<td>
						<s:property value="firstName" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>ふりがな（姓）</label>
					</td>
					<td>
						<s:property value="familyNameKana" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>ふりがな（名）</label>
					</td>
					<td>
						<s:property value="firstNameKana" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>性別</label>
					</td>
					<td>
						<s:if test="sex==0">男　性</s:if>
						<s:if test="sex==1">女　性</s:if>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>メールアドレス</label>
					</td>
					<td>
						<s:property value="userMail" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>お電話番号</label>
					</td>
					<td>
						<s:property value="userTel" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>郵便番号</label>
					</td>
					<td>
						<s:property value="postalCode" escape="false"/>
					</td>
				</tr>
				<tr id="box">
					<td>
						<label>ご住所</label>
					</td>
					<td>
						<s:property value="userAddress" escape="false"/>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="完了"/>
					</td>
				</tr>
				</s:form>
			</table>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>

</body>
</html>