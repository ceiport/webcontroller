package com.ceiport.crawling.model;

import java.util.Date;

/**
 * 清洗数据后入库的数据。
 */
public class BondDisclosure {
    /**
     * id
     */
    private int id;
    /**
     * 标题
     */
    private String title;
    /**
     * 发布时间
     */
    private String publishDate;
    /**
     * 保存路径
     */
    private String savePath;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 入库时间
     */
    private Date createDate;
    /**
     * 交易所类型：上海交易所，深圳交易所，中国货币网
     */
    private String ExchangeType;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getExchangeType() {
        return ExchangeType;
    }

    public void setExchangeType(String exchangeType) {
        ExchangeType = exchangeType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
