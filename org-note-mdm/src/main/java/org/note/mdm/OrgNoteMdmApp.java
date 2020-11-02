package org.note.mdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class OrgNoteMdmApp {

    public static void main(String[] args) {
        SpringApplication.run(OrgNoteMdmApp.class);
    }

}
