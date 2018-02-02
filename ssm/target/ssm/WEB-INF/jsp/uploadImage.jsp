<%--
  Created by IntelliJ IDEA.
  User: Twinkle
  Date: 2018/2/1
  Time: 19:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <title>上传图片</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/uploadpic" method="post" enctype="multipart/form-data">
    <input type="file" name="picture">
    <input type="submit">
</form>
<button onclick="sendJson()">sendJson</button>
</body>
<script>
    //请求json响应json
    function sendJson() {
        $.ajax({
            type: "post",
            url: "${pageContext.request.contextPath }/sendJson",
            contentType: "application/json;charset=utf-8",
            data: '{"name":"测试商品","price":99.9}',
            success: function (data) {
                alert(data);
            }
        });
    }

</script>
</html>
