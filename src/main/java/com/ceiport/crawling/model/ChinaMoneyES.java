package com.ceiport.crawling.model;

/**
 * 中国货币网原始数据
 */
public class ChinaMoneyES {
    private int id;
    private String cnfdntLvl;
    private String bondDfndCd;
    private String title;
    private String publishdateStr;
    private String draftPath;
    private int attSize;
    private String suffix;
    private int txt ;
    private String contentId ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnfdntLvl() {
        return cnfdntLvl;
    }

    public void setCnfdntLvl(String cnfdntLvl) {
        this.cnfdntLvl = cnfdntLvl;
    }

    public String getBondDfndCd() {
        return bondDfndCd;
    }

    public void setBondDfndCd(String bondDfndCd) {
        this.bondDfndCd = bondDfndCd;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishdateStr() {
        return publishdateStr;
    }

    public void setPublishdateStr(String publishdateStr) {
        this.publishdateStr = publishdateStr;
    }

    public String getDraftPath() {
        return draftPath;
    }

    public void setDraftPath(String draftPath) {
        this.draftPath = draftPath;
    }

    public int getAttSize() {
        return attSize;
    }

    public void setAttSize(int attSize) {
        this.attSize = attSize;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public int getTxt() {
        return txt;
    }

    public void setTxt(int txt) {
        this.txt = txt;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
}
