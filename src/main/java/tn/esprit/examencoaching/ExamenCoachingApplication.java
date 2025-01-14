package tn.esprit.examencoaching;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAspectJAutoProxy
@EnableScheduling

@SpringBootApplication
public class ExamenCoachingApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamenCoachingApplication.class, args);
    }

}
