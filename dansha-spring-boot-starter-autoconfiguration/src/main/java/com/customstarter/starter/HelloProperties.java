package com.customstarter.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liuxiaokang
 * @description
 * @date 2020/6/5
 */

@ConfigurationProperties(prefix = "dansha.hello")// 绑定配置文件中以所有dansha.hello开头的配置
public class HelloProperties {
    
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
