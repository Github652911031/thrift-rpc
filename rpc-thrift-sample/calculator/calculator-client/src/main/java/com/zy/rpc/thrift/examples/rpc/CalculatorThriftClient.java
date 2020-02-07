package com.zy.rpc.thrift.examples.rpc;


import com.zy.rpc.thrift.client.annotation.ThriftClient;
import com.zy.rpc.thrift.client.common.ThriftClientAware;
import com.zy.rpc.thrift.examples.thrift.CalculatorService;

@ThriftClient(serviceId = "thrift-calculator-rpc-server", refer = CalculatorService.class, version = 2.0)
public interface CalculatorThriftClient extends ThriftClientAware<CalculatorService.Client> {
}
