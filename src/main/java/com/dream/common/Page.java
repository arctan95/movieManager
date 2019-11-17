package com.dream.common;

import java.util.List;

/**
 * @ClassName page
 * @Description TODO
 * @Author tan
 * @Date 2019/11/17 17:23
 * @Version 1.0
 **/
public class Page<T> {
    private int total;
    private int page;
    private int size;
    private List<T> rows;
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public List<T> getRows() {
        return rows;
    }
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
