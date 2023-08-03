package com.aligunes;

import com.aligunes.service.MessageProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource({"classpath*:applicationContext.xml"})
public class Application {

    private static Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        LOG.info("Uygulama Başladı.");
      //  SpringApplication.run(Application.class, args);

        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        MessageProcessor messageProcessor = applicationContext.getBean(MessageProcessor.class);
        messageProcessor.processingMsg("Selam nasılsın?");

        LOG.info("Uygulama sonlandı.");


    }

}
