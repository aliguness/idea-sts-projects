package com.aligunes.config;

import com.aligunes.service.AService;
import com.aligunes.service.MessageProcessor;
import com.aligunes.service.MessageProcessorImpl;
import com.aligunes.service.SelectService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextJavaConfig {
    @Bean(name = "aService")
    public SelectService aService(){
        return new AService();
    }
    @Bean(name = "bService")
    public SelectService bService(){
        return new AService();
    }
    @Bean(name = "cService")
    public SelectService cService(){
        return new AService();
    }
    @Bean
    public MessageProcessor messageProcessor(){
        return new MessageProcessorImpl(aService());
    }
}
