package com.ceiport.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * 中国货币网请求参数信息,通过数据库和配置文件双向绑定
 */
@Configuration
@PropertySource("classpath:request-params.properties")
@ConfigurationProperties(prefix = "china")
public class ChinaMoneyParams {

    @Value("{china.typeCode}")
    private String typeCode;

    @Value("{china.isNewTab}")
    private String isNewTab;

    @Value("{china.limit}")
    private String limit;

    @Value("{china.timeIn}")
    private String timeIn;

    public String getTypeCode() {
        return typeCode;
    }

    public String getIsNewTab() {
        return isNewTab;
    }

    public String getLimit() {
        return limit;
    }

    public String getTimeIn() {
        return timeIn;
    }
}
