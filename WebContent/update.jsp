<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改用户信息</title>
  </head>
  <body>
   <center>
     <s:form action="userupdate" method="post">
     <tr>
       <td colspan="2" align="center">
         <h1><s:text name="修改用户信息"/></h1><br/>
         <s:actionerror/>
       </td>
     </tr>
 	 <s:textfield name="user.id" key="用户ID" required="true"></s:textfield>  
     <s:textfield name="user.name" key="用户名" required="true"></s:textfield> 
     <s:password name="user.password" key="密码" ></s:password>  
     <s:textfield name="user.type" key="类型"></s:textfield>  
     <s:submit value="提交"/>
     <s:reset value="重置"/>
     <s:set/>
     </s:form>
   </center>
  </body>
</html>
