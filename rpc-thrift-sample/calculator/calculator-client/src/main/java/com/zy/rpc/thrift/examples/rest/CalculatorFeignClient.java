package com.zy.rpc.thrift.examples.rest;


import com.zy.rpc.thrift.examples.http.ICalculatorService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "thrift-calculator-rest-server")
public interface CalculatorFeignClient extends ICalculatorService {

    @Override
    @GetMapping("/rest/add")
    int add(@RequestParam("arg1") int arg1, @RequestParam("arg2") int arg2) throws Exception;

    @Override
    @GetMapping("/rest/subtract")
    int subtract(@RequestParam("arg1") int arg1, @RequestParam("arg2") int arg2) throws Exception;

    @Override
    @GetMapping("/rest/multiply")
    int multiply(@RequestParam("arg1") int arg1, @RequestParam("arg2") int arg2) throws Exception;

    @Override
    @GetMapping("/rest/division")
    int division(@RequestParam("arg1") int arg1, @RequestParam("arg2") int arg2) throws Exception;

}
