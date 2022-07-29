package com.in28minutes.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "localServiceVNClient", url = "localhost:8100", path = "/api/server")
public interface LocalServiceVNClient {

    @GetMapping("/firstService")
    String getServerFirstServiceData();

    @GetMapping("/secondService")
    String getServerSecondServiceData();

}