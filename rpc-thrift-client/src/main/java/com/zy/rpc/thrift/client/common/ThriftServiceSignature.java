package com.zy.rpc.thrift.client.common;

import com.zy.rpc.thrift.client.loadbalancer.RoundRobinRule;

public class ThriftServiceSignature {

    private String thriftServiceId;

    private Class<?> thriftServiceClass;

    private Class<?> thriftLoadBalancer;

    public ThriftServiceSignature(String thriftServiceId, Class<?> thriftServiceClass) {
        this(thriftServiceId, thriftServiceClass, RoundRobinRule.class);
    }
    public ThriftServiceSignature(String thriftServiceId, Class<?> thriftServiceClass, Class<?> thriftLoadBalancer) {
        this.thriftServiceId = thriftServiceId;
        this.thriftServiceClass = thriftServiceClass;
        this.thriftLoadBalancer = thriftLoadBalancer;
    }

    public String getThriftServiceId() {
        return thriftServiceId;
    }

    public void setThriftServiceId(String thriftServiceId) {
        this.thriftServiceId = thriftServiceId;
    }

    public Class<?> getThriftServiceClass() {
        return thriftServiceClass;
    }

    public void setThriftServiceClass(Class<?> thriftServiceClass) {
        this.thriftServiceClass = thriftServiceClass;
    }

    public Class<?> getThriftLoadBalancer() {
        return thriftLoadBalancer;
    }

    public void setThriftLoadBalancer(Class<?> thriftLoadBalancer) {
        this.thriftLoadBalancer = thriftLoadBalancer;
    }

    public String marker() {
        return String.join("$", new String[]{
                thriftServiceId, thriftServiceClass.getName()
        });
    }
}
