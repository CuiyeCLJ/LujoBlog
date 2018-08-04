<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018.08.04
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
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

        <a class="navbar-brand" href="/listAllArticle">TeIphu</a>
    </div>
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav navbar-left">
            <li role="presentation"><a href="/listAllArticle">首頁</a></li>
            <li role="presentation"><a href="http://www.baidu.com">歸檔</a></li>
            <li role="presentation"><a href="/listAllCategory">分類</a></li>
            <li role="presentation"><a href="/listAllTag">標簽</a></li>
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
            <div class="col-sm-3 col-md-9">
                <div class="thumbnail">
                    <img src="WEB-INF/view/img/myicon2.jpg">
                </div>
                <div class="caption">
                    <h3>Teiphu</h3>
                    <h4>Java&nbsp;Developer</h4>
                    <span>Guangzhou,&nbsp;China</span>
                    <p><a href="#" class="btn btn-info" role="button">關注我</a></p>
                    <ul class="nav nav-pills nav-stacked">
                        <li><a href="#">链接 1</a></li>
                        <li><a href="#">链接 2</a></li>
                        <li><a href="#">链接 3</a></li>
                    </ul>
                </div>
            </div>
            <%--<h2>關於我</h2>--%>
            <%--<h5>我的照片</h5>--%>
            <%--<div class="fakeimg">這邊插入圖像</div>--%>
            <%--<p>關於我的介紹</p>--%>
            <%--<h3>鏈接</h3>--%>
            <%--<p>描述文本</p>--%>
            <%--<ul class="nav nav-pills nav-stacked">--%>
                <%--<li><a href="#">链接 1</a></li>--%>
                <%--<li><a href="#">链接 2</a></li>--%>
                <%--<li><a href="#">链接 3</a></li>--%>
            <%--</ul>--%>
        </div>

        <div class="col-sm-8">
            <div>
                <div>
                    <a href="#" style="text-decoration: none">
                        <span><h3>${category.categoryName}</h3></span>
                    </a>
                </div>
                <div>
                    <c:forEach items="${articles}" var="article">
                        <div class="panel panel-info">
                            <div class="panel-heading">
                                <a href="/article/${article.articleId}" style="text-decoration: none">
                                    <h3 class="panel-title">${article.articleTitle}</h3>
                                </a>
                            </div>
                            <div class="panel-body">
                                <a href="#" style="text-decoration: none">
                                    <time>${article.articleCreationTime}</time>
                                </a>
                                <c:forEach items="${article.tags}" var="tag">
                                    <a href="/tag/${tag.tagId}" style="text-decoration: none">&nbsp;&nbsp;${tag.tagName}</a>
                                </c:forEach>
                                <a href="/category/${article.category.categoryId}" style="text-decoration: none">&nbsp;&nbsp;&nbsp;&nbsp;${article.category.categoryName}</a>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
