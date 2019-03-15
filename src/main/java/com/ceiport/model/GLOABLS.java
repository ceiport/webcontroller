package com.ceiport.model;

import java.util.Date;

/**
 * 数据抓取配置
 */
public class GLOABLS {
    private int id;
    /**
     * 抓取的交易所类型
     */
    private String exchangeType;
    /**
     * 每页显示条数
     */
    private String pageSize;
    /**
     * 页数
     */
    private String pageNo;
    /**
     * 查询开始日期
     */
    private Date startDate;
    /**
     * 查询结束日期
     */
    private Date endDate;
    /**
     * 上一次运行时间
     */
    private Date lastRunningTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public String getPageNo() {
        return pageNo;
    }

    public void setPageNo(String pageNo) {
        this.pageNo = pageNo;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Date getLastRunningTime() {
        return lastRunningTime;
    }

    public void setLastRunningTime(Date lastRunningTime) {
        this.lastRunningTime = lastRunningTime;
    }
}
