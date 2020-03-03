package com.zhiyuan.starter.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**
 * @ClassName TalKProperties
 * @Description Todo
 * @Author ming.lu
 * @Date 2020/2/28 19:19
 */
//@ConfigurationProperties 注解，我们可以方便的获取这些参数值.
@ConfigurationProperties(prefix = "zhiyuan.talk")
public class TalKProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
