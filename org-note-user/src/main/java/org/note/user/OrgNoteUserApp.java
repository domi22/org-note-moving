package org.note.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication(scanBasePackages={"org.note.*"})
public class OrgNoteUserApp extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(OrgNoteUserApp.class,args);
    }

    /**
     * 加载到外部容器启动
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(OrgNoteUserApp.class);
    }

}
