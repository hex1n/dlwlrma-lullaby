package com.dlwlrma.lullaby;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author hex1n
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Ch21EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch21EurekaClientApplication.class, args);
    }

}
