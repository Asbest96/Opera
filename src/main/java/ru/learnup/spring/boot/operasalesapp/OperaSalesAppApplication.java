package ru.learnup.spring.boot.operasalesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.learnup.spring.boot.operasalesapp.config.MyConfiguration;
import ru.learnup.spring.boot.operasalesapp.entity.Opera;
import ru.learnup.spring.boot.operasalesapp.services.OperaService;

@SpringBootApplication
public class OperaSalesAppApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        OperaService operaService = context.getBean(OperaService.class);

        Opera opera1 = new Opera("Opera 1", "Description1", 12, 300);
        Opera opera2 = new Opera("Opera 2", "Description2", 16, 500);

        operaService.addOpera(opera1);
        operaService.addOpera(opera2);

        operaService.buyTicket("Opera 1");
        operaService.sellTicket("Opera 1");

        operaService.printOpera(opera1);
        operaService.printAll();

        operaService.deleteOpera(opera2);
        operaService.printAll();

    }

}
