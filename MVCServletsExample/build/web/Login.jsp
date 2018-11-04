<%-- 
    Document   : Login
    Created on : Oct 16, 2018, 5:32:49 AM
    Author     : tinkerc
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1>Login Page</h1>
        <html:form action="/login">
            <table border="0">
                <tbody>
                    <tr>
                        <td colspan="2">
                            <bean:write name="LoginForm" property="error" filter="false" />
                            &nbsp;
                        </td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><html:text property="name" /></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><html:text property="email" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><html:submit value="Login" /></td>
                    </tr>
                </tbody>
            </table>        
        </html:form>
    </body>
</html>
