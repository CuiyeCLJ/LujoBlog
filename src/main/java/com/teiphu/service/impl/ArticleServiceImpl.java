package com.teiphu.service.impl;

import com.teiphu.domain.Article;
import com.teiphu.domain.Category;
import com.teiphu.domain.Tag;
import com.teiphu.mapper.ArticleMapper;
import com.teiphu.mapper.CategoryMapper;
import com.teiphu.mapper.CommentMapper;
import com.teiphu.mapper.TagMapper;
import com.teiphu.service.ArticleService;
import com.teiphu.util.Page;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lifu.Zheng
 * @data 2018.04.30 15:57
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    private static final Logger LOGGER = Logger.getLogger(ArticleServiceImpl.class);

    @Autowired
    private ArticleMapper articleMapper;

    @Autowired
    private TagMapper tagMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public void addArticle(Article article) {
        articleMapper.save(article);
    }

    @Override
    public void removeArticle(Integer articleId) {
        articleMapper.deleteByArticleId(articleId);
    }

    @Override
    public Article findArticle(Integer articleId) {
        Article article = articleMapper.selectByArticleId(articleId);
        List<Tag> tags = tagMapper.selectTagsByArticleId(articleId);
        article.setTags(tags);
        Category category = categoryMapper.selectByCategoryId(article.getCategoryId());
        article.setCategory(category);
        return article;
    }

    @Override
    public Article findByArticleIdAssociateOtherTables(Integer articleId) {
        Article article = articleMapper.selectByArticleIdAssociateOtherTables(articleId);
        return article;
    }

    @Override
    public List<Article> findAllArticles() {
        List<Article> articles = articleMapper.selectAllArticle();
        return articles;
    }

    @Override
    public List<Article> findArticlesByTagId(Integer tagId) {
        List<Article> articles = articleMapper.selectArticlesByTagId(tagId);
        return articles;
    }

    @Override
    public List<Article> findArticlesByCategoryId(Integer categoryId) {
        List<Article> articles = articleMapper.selectArticlesByCategoryId(categoryId);
        return articles;
    }

    @Override
    public Article findPreArticle(Integer articleId) {
        Article article = articleMapper.selectPreArticle(articleId);
        return article;
    }

    @Override
    public Article findLatArticle(Integer articleId) {
        Article article = articleMapper.selectLatArticle(articleId);
        return article;
    }

    @Override
    public List<Article> findArticleByPage(int curPage) {
        LOGGER.info("Invoke ArticleServiceImpl.findArticleByPage()");
        int totalRecords = articleMapper.countArticle();
        LOGGER.info(totalRecords);
//        Page page = new Page(totalRecords, curPage);
        Page page = Page.getInstance();
        page.setTotalRecords(totalRecords);
        page.setCurPage(curPage);
        List<Article> articles = articleMapper.selectArticlesByPage(page.getStartPos(), page.getPageSize());
        LOGGER.info(page.getTotalPageNum());
//        for (int i = 0; i < articles.size(); i++) {
//            Article article = articles.get(i);
//            article.setTags(tagMapper.selectTagsByArticleId(article.getArticleId()));
//        }
        return articles;
    }

    @Override
    public List<Article> findArticlesByPageAssociateOtherTables(int curPage) {
        LOGGER.info("Invoke ArticleServiceImpl.findArticlesByPageAssociateOtherTables()");
        int totalRecords = articleMapper.countArticle();
        Page page = Page.getInstance();
        page.setTotalRecords(totalRecords);
        page.setCurPage(curPage);
        List<Article> articles = articleMapper.selectArticlesByPageAssociateOtherTables(page.getStartPos(), page.getPageSize());
        return articles;
    }

    @Override
    public void modifyArticle(Article article) {
        articleMapper.updateArticle(article);
    }

    @Override
    public Integer countArticle() {
        Integer articleCount = articleMapper.countArticle();
        return articleCount;
    }

    @Override
    public Integer countArticleWithCategory(Integer categoryId) {
        Integer count = articleMapper.countArticleByCategoryId(categoryId);
        return count;
    }

    @Override
    public Integer countArticleWithTag(Integer tagId) {
        Integer count = articleMapper.countArticleByTagId(tagId);
        return count;
    }

    @Override
    public Integer countArticleComment(Integer articleId) {
        Integer count = commentMapper.countArticleComment(articleId);
        return count;
    }
}
