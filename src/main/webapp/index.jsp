
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

    <title>封面</title>

    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <%--<link href="./WEB-INF/view/css/cover.css" rel="stylesheet">--%>
    <link href="https://v3.bootcss.com/examples/cover/cover.css" rel="stylesheet">
</head>
<body>
<%--style="background-color:#F3FCFE;"--%>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%--<script>window.jQuery || document.write('<script src="./WEB-INF/view/js/jquery.min.js"><\/script>')</script>--%>
<script>window.jQuery || document.write('<script src="https://v3.bootcss.com/assets/js/vendor/jquery.min.js"><\/script>')</script>

<%--<nav class="navbar navbar-default">--%>

    <%--<div class="navbar-header">--%>

        <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse"--%>
                <%--data-target="#bs-example-navbar-collapse-1" aria-expanded="false">--%>

            <%--<span class="sr-only">Toggle navigation</span>--%>
            <%--<span class="icon-bar"></span>--%>
            <%--<span class="icon-bar"></span>--%>
            <%--<span class="icon-bar"></span>--%>
        <%--</button>--%>

        <%--<a class="navbar-brand" href="index.html">TeIphu</a>--%>
    <%--</div>--%>
    <%--<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">--%>
        <%--<ul class="nav navbar-nav navbar-left">--%>
            <%--<li role="presentation"><a href="/listAllArticle">首頁</a></li>--%>
            <%--<li role="presentation"><a href="#">歸檔</a></li>--%>
            <%--<li role="presentation"><a href="/listAllCategory">分類</a></li>--%>
            <%--<li role="presentation"><a href="/listAllTag">標簽</a></li>--%>
            <%--<li role="presentation"><a href="#">關於</a></li>--%>
        <%--</ul>--%>
        <%--<form class="navbar-form navbar-right">--%>
            <%--<div class="form-group">--%>
                <%--<input type="text" class="form-control" placeholder="Search">--%>
            <%--</div>--%>
            <%--<button type="submit" class="btn btn-default ">搜索</button>--%>
        <%--</form>--%>
    <%--</div>--%>
<%--</nav>--%>

<%--<div>--%>
    <%--<iframe marginwidth="0" marginheight="0" frameborder="0" scrolling="no" src="WEB-INF/view/head.jsp" height="auto" width="100%"></iframe>--%>
<%--</div>--%>

<%--<div class="container">--%>
    <%--<div class="row">--%>
        <%--<div class="col-sm-3">--%>
            <%--<div class="col-sm-3 col-md-9">--%>
                <%--<div class="thumbnail">--%>
                    <%--<img src="WEB-INF/view/img/myicon2.jpg">--%>
                <%--</div>--%>
                <%--<div class="caption">--%>
                    <%--<h3>Teiphu</h3>--%>
                    <%--<h4>Java&nbsp;Developer</h4>--%>
                    <%--<span>Guangzhou,&nbsp;China</span>--%>
                    <%--<p><a href="#" class="btn btn-info" role="button">關注我</a></p>--%>
                    <%--<ul class="nav nav-pills nav-stacked">--%>
                        <%--<li><a href="#">链接 1</a></li>--%>
                        <%--<li><a href="#">链接 2</a></li>--%>
                        <%--<li><a href="#">链接 3</a></li>--%>
                    <%--</ul>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>

        <%--<div class="col-sm-9">--%>

            <%--<c:forEach items="${articles}" var="article" >--%>
                <%--<div class="panel panel-default">--%>
                    <%--<div class="panel-title">--%>
                        <%--<h3>&nbsp;${article.articleTitle}</h3>--%>
                    <%--</div>--%>
                    <%--<div>--%>
                        <%--<a href="#" style="text-decoration: none">--%>
                            <%--<time pubdate>&nbsp;&nbsp;${article.articleCreationTime}</time>--%>
                        <%--</a>--%>
                        <%--<a href="#" style="text-decoration: none">&nbsp;哈希</a>--%>
                        <%--<a href="#" style="text-decoration: none">&nbsp;哈希</a>--%>
                    <%--</div>--%>
                    <%--<div class="panel-body">--%>
                        <%--<p><blockquote><p>${article.articleSummary}</p></blockquote></p>--%>

                    <%--</div>--%>

                    <%--<div class="panel-footer">--%>
                        <%--<p><a href="#" style="text-decoration: none">查看更多</a></p>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</c:forEach>--%>

            <%--<div>--%>
                <%--<ul class="pager">--%>
                    <%--<li><a href="https://www.google.com"><span aria-hidden="true">&larr;</span> 上一页</a></li>--%>
                    <%--<li><a href="https://www.google.com">1</a></li>--%>
                    <%--<li><a href="https://www.google.com">2</a></li>--%>
                    <%--<li><a href="https://www.google.com">3</a></li>--%>
                    <%--<li><a href="https://www.google.com">4</a></li>--%>
                    <%--<li><a href="https://www.google.com">5</a></li>--%>
                    <%--<li><a href="https://www.google.com">6</a></li>--%>
                    <%--<li><a href="https://www.google.com">下一页<span aria-hidden="true">&rarr;</span></a></li>--%>
                <%--</ul>--%>
            <%--</div>--%>

        <%--</div>--%>


    <%--</div>--%>
<%--</div>--%>


<%--<footer class="modal-footer">--%>
    <%--<p>&copy; 2018 Company, Inc.</p>--%>
<%--</footer>--%>
<div class="site-wrapper">
    <div class="site-wrapper-inner">
        <div class="cover-container">
            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">鄭立富</h3>
                    <nav>
                        <ul class="nav masthead-nav">
                            <li><a href="/listAllArticle">Home</a></li>
                            <li><a href="#">Features</a></li>
                            <li><a href="#">Contact</a></li>
                        </ul>
                    </nav>
                </div>
            </div>
            <div class="inner cover">
                <h1 class="cover-heading">Cover your page.</h1>
                <p class="lead">Cover is a one-page template for building simple and beautiful home pages.
                    Download, edit the text, and add your own fullscreen background photo to make it your own.</p>
                <p class="lead">
                    <a href="#" class="btn btn-lg btn-default">瞭解更多</a>
                </p>
            </div>
            <div class="mastfoot">
                <div class="inner">
                    <p>&copy; 2018 Company, by<a href="#">@TeIphu</a>&nbsp; Inc.</p>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
