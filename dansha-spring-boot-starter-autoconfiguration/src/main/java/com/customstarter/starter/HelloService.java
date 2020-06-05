package com.customstarter.starter;

/**
 * @author liuxiaokang
 * @description
 * @date 2020/6/5
 */
public class HelloService {
    
    HelloProperties helloProperties;
    
    public HelloProperties getHelloProperties() {
        return helloProperties;
    }
    
    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }
    
    public String sayHelloDansha(String name){
        return helloProperties.getPrefix()+"-" +name + helloProperties.getSuffix();
    }
}