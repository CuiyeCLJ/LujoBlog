<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.07.16
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>首頁</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<nav class="navbar navbar-default">

    <div class="navbar-header">

        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                data-target="#bs-example-navbar-collapse-1" aria-expanded="false">

            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>

        <a class="navbar-brand" href="index.html">TeIphu</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav navbar-left">
            <li role="presentation"><a href="/listAllArticle">首頁</a></li>
            <li role="presentation"><a href="http://www.baidu.com">歸檔</a></li>
            <li role="presentation"><a href="http://www.baidu.com">分類</a></li>
            <li role="presentation"><a href="http://www.baidu.com">標簽</a></li>
            <li role="presentation"><a href="http://www.baidu.com">關於</a></li>
        </ul>
        <form class="navbar-form navbar-right">
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Search">
            </div>
            <button type="submit" class="btn btn-default ">搜索</button>
        </form>
    </div>
</nav>

<div class="container">
    <div class="row">
        <div class="col-sm-3">
            <h2>關於我</h2>
            <h5>我的照片</h5>
            <div class="fakeimg">這邊插入圖像</div>
            <p>關於我的介紹</p>
            <h3>鏈接</h3>
            <p>描述文本</p>
            <ul class="nav nav-pills nav-stacked">
                <li><a href="#">链接 1</a></li>
                <li><a href="#">链接 2</a></li>
                <li><a href="#">链接 3</a></li>
            </ul>
        </div>

        <div class="col-sm-8">

            <c:forEach items="${articles}" var="article" >
                <div class="panel panel-default">
                    <div class="panel-title">
                        <h3>&nbsp;${article.articleTitle}</h3>
                    </div>
                    <div>
                        <a href="#" style="text-decoration: none">
                            <time pubdate>&nbsp;&nbsp;${article.articleCreationTime}</time>
                        </a>
                        <a href="#" style="text-decoration: none">&nbsp;哈希</a>
                        <a href="#" style="text-decoration: none">&nbsp;哈希</a>
                    </div>
                    <div class="panel-body">
                        <p><blockquote><p>${article.articleSummary}</p></blockquote></p>

                    </div>

                    <div class="panel-footer">
                        <p><a href="#" style="text-decoration: none">查看更多</a></p>
                    </div>
                </div>
            </c:forEach>

            <div>
                <ul class="pager">
                    <li><a href="https://www.google.com"><span aria-hidden="true">&larr;</span> 上一页</a></li>
                    <li><a href="https://www.google.com">1</a></li>
                    <li><a href="https://www.google.com">2</a></li>
                    <li><a href="https://www.google.com">3</a></li>
                    <li><a href="https://www.google.com">4</a></li>
                    <li><a href="https://www.google.com">5</a></li>
                    <li><a href="https://www.google.com">6</a></li>
                    <li><a href="https://www.google.com">下一页<span aria-hidden="true">&rarr;</span></a></li>
                </ul>
            </div>

        </div>


    </div>
</div>


<footer class="modal-footer">
    <p>&copy; 2018 Company, Inc.</p>
</footer>

</body>
</html>
