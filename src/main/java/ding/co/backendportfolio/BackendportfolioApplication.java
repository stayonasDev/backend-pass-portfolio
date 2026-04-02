package ding.co.backendportfolio;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableJpaAuditing
@SpringBootApplication
@EnableScheduling
@Log4j2
public class BackendportfolioApplication {
    public static void main(String[] args) {
        log.info("Main Branch PR -> Git Action Workflow Test!!");
        SpringApplication.run(BackendportfolioApplication.class, args);
    }

}
