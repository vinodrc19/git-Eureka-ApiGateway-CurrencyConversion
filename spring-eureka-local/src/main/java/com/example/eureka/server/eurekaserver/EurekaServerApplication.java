/*
package com.example.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEurekaLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaLocalApplication.class, args);
	}
}
*/

package com.example.eureka.server.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

public static void main(String[] args) {
SpringApplication.run(EurekaServerApplication.class, args);
}
}