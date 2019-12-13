package org.hg.cloud.gateway.filter;

/**
 * @Author huangggang6135@gmail.com
 * @create 2019/12/12
 */
public enum ZuulFilterType {
    PRE("pre"),ROUTE("route"),POST("post"),ERROR("error");
    private String type;

    ZuulFilterType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
