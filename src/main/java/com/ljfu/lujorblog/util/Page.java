package com.ljfu.lujorblog.util;

/**
 * 分页类
 * @author Lifu.Zheng
 * @data 2018.05.02 22:37
 */
public class Page {

//    默认每页的记录数
    public static final int PAGE_SIZE = 10;

//    默认页号，为第一页
    public static final int PAGE_NUM = 1;

//    当前页号
    private int curPage;

//    总页数
    private int totalPageNum;

//    总记录数
    private int totalRecords;

//    每页的记录数
    private int pageSize = PAGE_SIZE;

    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        this.curPage = curPage;
    }

    public int getTotalPageNum() {
        return totalPageNum;
    }

    public void setTotalPageNum(int totalPageNum) {
        this.totalPageNum = totalPageNum;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
