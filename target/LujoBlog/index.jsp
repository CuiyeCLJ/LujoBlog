<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>首页</title>
    <link rel="alternate" href="WEB-INF/view/themes/icarus/source/libs/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="WEB-INF/view/themes/icarus/source/libs/open-sans/styles.css">
    <link rel="stylesheet" href="WEB-INF/view/themes/icarus/source/libs/source-code-pro/styles.css">
    <link rel="stylesheet" href="WEB-INF/view/themes/icarus/source/css/style.styl">
    <link rel="stylesheet" href="/lib/fancybox/jquery.fancybox.css">
    <link rel="stylesheet" href="WEB-INF/view/themes/icarus/source/libs/lightgallery/css/lightgallery.min.css">
    <link rel="stylesheet" href="WEB-INF/view/themes/icarus/source/libs/justified-gallery/justifiedGallery.min.css">

    <script src="WEB-INF/view/themes/icarus/source/libs/jquery/2.1.3/jquery.min.js" ></script>

    <script>
        var _hmt = _hmt || [];
        (function() {
            var hm = document.createElement("script");
            hm.src = "//hm.baidu.com/hm.js?44bb8bfb1a576270255713e37746eb82";
            var s = document.getElementsByTagName("script")[0];
            s.parentNode.insertBefore(hm, s);
        })();
    </script>
</head>

<body>

    <div id="container">

        <header id="header">
            <div id="header-main" class="header-inner">
                <div class="outer">

                    <a href="/" id="logo" >
                        <i class="logo" ></i>
                        <span class="site-title" >Lonuan&#39;s Home</span>
                    </a>

                    <nav id="main-nav">
                        <a class="main-nav-link" href="/.">首页</a>
                        <a class="main-nav-link" href="/archives">归档</a>
                        <a class="main-nav-link" href="/categories">分类</a>
                        <a class="main-nav-link" href="/tags">标签</a>
                        <a class="main-nav-link" href="/about">关于</a>
                        <a class="main-nav-link" href="/message">留言</a>
                        <a class="main-nav-link" href="/friends">友链</a>
                        <a class="main-nav-link" href="/reading">正在读...</a>
                    </nav>

                    <nav id="sub-nav">
                        <div class="profile" id="profile-nav">
                            <a id="profile-anchor" >
                                <img class="avatar" src="WEB-INF/view/img/6732643_135755678138.jpg">
                                <i class="fa fa-caret-down"></i>
                            </a>
                        </div>
                    </nav>

                    <div id="search-form-wrap">
                        <form class="search-form">
                            <input type="text" class="ins-search-input search-form-input" placeholder="搜索">
                            <button type="submit" class="search-form-submit"></button>
                        </form>

                        <div class="ins-search">
                            <div class="ins-search-mask"></div>
                            <div class="ins-search-container">
                                <div class="ins-input-wrapper">
                                    <input type="text" class="ins-search-input" placeholder="想要查找什麽……">
                                    <span class="ins-close ins-selectable"><i class="fa fa-times-circle"></i></span>
                                </div>
                                <div class="ins-section-wrapper">
                                    <div class="ins-section-container"></div>
                                </div>
                            </div>
                        </div>

                        <script>
                            (function (window) {
                                var INSIGHT_CONFIG = {
                                    TRANSLATION: {
                                        POSTS: '文章',
                                        PAGES: '页面',
                                        CATEGORIES: '分类',
                                        TAGS: '标签',
                                        UNTITLED: '(未命名)',
                                    },
                                    ROOT_URL: '/',
                                    CONTENT_URL: '/content.json',
                                };
                                window.INSIGHT_CONFIG = INSIGHT_CONFIG;
                            })(window);
                        </script>

                        <script src="WEB-INF/view/themes/icarus/source/js/insight.js"></script>

                    </div>
                </div>
            </div>

            <div id="main-nav-mobile" class="header-sub header-inner">
                <table class="menu outer">
                    <tr>
                        <td><a class="main-nav-link" href="/.">首页</a></td>
                        <td><a class="main-nav-link" href="/archives">归档</a></td>
                        <td><a class="main-nav-link" href="/categories">分类</a></td>
                        <td><a class="main-nav-link" href="/tags">标签</a></td>
                        <td><a class="main-nav-link" href="/about">关于</a></td>
                        <td><a class="main-nav-link" href="/message">留言</a></td>
                        <td><a class="main-nav-link" href="/friends">友链</a></td>
                        <td><a class="main-nav-link" href="/reading">正在读...</a></td>
                        <td>
                            <div class="search-form">
                                <input type="text" class="ins-search-input search-form-input" placeholder="搜索">
                            </div>
                        </td>
                    </tr>
                </table>
            </div>

        </header>

        <div class="outer">

            <aside id="profile">
                <div class="inner profile-inner">
                    <div class="base-info profile-block">
                        <img id="avatar" src="https://yemengying.com/qiniu/image/2017-08-10-1.pic.jpg">
                        <h2 id="name">Lonuan</h2>
                        <h3 id="title">Java Developer</h3>
                        <span id="location">
                            <i class="fa fa-map-marker"></i>Canton, China
                        </span>
                        <a id="follow" target="_blank" href="https://github.com/CuiyeCLJ">關注我</a>
                    </div>

                    <div class="article-info profile-block">
                        <div class="article-info-block">
                            100<span>文章</span>
                        </div>
                        <div class="article-info-block">
                            36<span>标签</span>
                        </div>
                    </div>

                    <div class="profile-block social-links">
                        <table>
                            <tr>
                                <td>
                                    <a href="https://github.com/CuiyeCLJ" target="_blank" title="Github" class="tooltip">
                                        <i class="fa fa-github"></i>
                                    </a>
                                </td>
                                <td>
                                    <a href="https://github.com/CuiyeCLJ" target="_blank" title="rss" class="tooltip">
                                        <i class="fa fa-rss"></i>
                                    </a>
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </aside>

            <section id="main">

                <c:forEach items="${articleList}" var="article" >
                    <article class="article "
                </c:forEach>

            </section>

        </div>

        <footer id="footer">
            <div class="outer">
                <div id="footer-info" class="inner">
                    &copy; 2018 Lifu Jheng<<br>
                    Powered by <a href="http://hexo.io/" target="_blank">Hexo</a>
                </div>
            </div>
        </footer>

        <script>
            DisqusJS.getRecentComments(document.querySelector('#disqus-recent-comments'));
        </script>

        <script src="WEB-INF/view/themes/icarus/source/js/main.js" ></script>

    </div>

</body>
</html>





















