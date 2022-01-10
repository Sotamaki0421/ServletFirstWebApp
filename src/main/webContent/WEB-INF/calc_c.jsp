<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<% double a = (double)request.getAttribute("a"); %>
<% double b = (double)request.getAttribute("b"); %>
<% double c = (double)request.getAttribute("c"); %>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>三平方の定理</title>
    </head>
    <body>
        <h1>直角をはさむ2辺の長さが <%= a %> と <%= b %> のとき、 斜辺の長さは <%= c %> になります。</h1>
    </body>
</html>