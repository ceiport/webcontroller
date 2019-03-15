package com.ceiport.enums;

/**
 * 交易所类型
 */
public enum ExchangeType {
    上海交易所("上交所","shanghai"), 深圳交易所("深交所","shenzhen"), 中国货币网("中国货币网","china");
    /**
     * 中文名称
     */
    private String nameCn;
    /**
     * 英文名称
     */
    private String nameEn;
    ExchangeType(String nameCn, String nameEn) {
        this.nameCn = nameCn;
        this.nameEn = nameEn;
    }
}
