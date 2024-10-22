package com.example.bookmyshowsst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BookMyShowSstApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookMyShowSstApplication.class, args);
    }

}

/*
    Steps to automatically add createdAt and lastModifiedAt columns.(Auditing Attributes);

    1). Add @EnableJpaAuditing annotation to the springboot application
    2). Add @EntityListners(AuditingEntityListener.class) to the BaseModel class
    3). Use @CreatedDate and @LastModifiedBy annotations to createdAt and lastModifiedAt fields respectively.
 */