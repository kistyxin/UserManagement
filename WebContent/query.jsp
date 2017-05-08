<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>显示用户信息</title>
</head>
<body>
<center>
	<h1>用户信息</h1>
  <table border="1" width="400">

   <tr>
     <th>用户ID</th>
     <th>用户名</th>
     <th>密码</th>
     <th>用户类型</th>
     <th>是否删除</th>
     <th>是否修改</th>
 </tr>
 <s:iterator value="#request.userlist" id="st">
 <tr>
      <td align="center"><s:property value="#st.id"/> </td>
      <td align="center"><s:property value="#st.name"/> </td>
      <td align="center"><s:property value="#st.password"/> </td>
      <td align="center"><s:property value="#st.type"/> </td>
	<td><a href="userdelete.action?id=<s:property value='#st.id'/>">删除</a></td>   
	<td><a href="update.jsp?id=<s:property value='#st.id'/>">更新</a></td>   
   </tr>   
   </s:iterator>
   </table>
   <br>
   <a href="save.jsp">添加用户</a>
</center>
</body>

</html>
