package org.note.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages={"org.note.*"})
public class OrgNoteGatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(OrgNoteGatewayApp.class,args);
    }
}
