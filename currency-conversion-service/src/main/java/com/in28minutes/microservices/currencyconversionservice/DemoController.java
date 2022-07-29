package com.in28minutes.microservices.currencyconversionservice;

//import com.in28minutes.microservices.currencyconversionservice.LocalServiceVNClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class DemoController {

    final LocalServiceVNClient localServiceClient;

    public DemoController(LocalServiceVNClient localServiceClient){
        this.localServiceClient = localServiceClient;
    }

    @GetMapping("/firstService")
    public String delegateFirstService(){
        return localServiceClient.getServerFirstServiceData();
    }


}