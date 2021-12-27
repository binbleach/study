<%--
  Created by IntelliJ IDEA.
  User: 不是我
  Date: 2021/7/25
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--动态获取base--%>
<%
    String basePath = request.getScheme() + "://" +
                    request.getServerName() + ":" + request.getServerPort()+
                    request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <%--base自定义，只针对当前页有效--%>
    <base href="<%=basePath%>"/>

</head>
<body>
<%=basePath%>
<h2>RequestMapping</h2>

<%--关于 开头有没有"/"，
    有就是代表绝对路径 不带/myweb/的。得自己加
    没有就是参考相对路径带/myweb/的，参考的是base标签，这个可以自己定义。
    myweb是自定义的名字，可以用EL表达式 ${pageContext.request.contextPath} 代替
 --%>

<a href="some.do">我是doSome方法</a>
<img src="images/meimei.jpg"/>
</body>
</html>
