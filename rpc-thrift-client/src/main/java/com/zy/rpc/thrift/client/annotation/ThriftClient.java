package com.zy.rpc.thrift.client.annotation;

import com.zy.rpc.thrift.client.loadbalancer.RoundRobinRule;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface ThriftClient {

    @AliasFor("name")
    String value() default "";

    @AliasFor("value")
    String name() default "";

    String serviceId();

    Class<?> balancer() default RoundRobinRule.class;

    Class<?> refer();



}
