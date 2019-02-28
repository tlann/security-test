package com.example.securitytest;

import com.example.securitytest.services.WebClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledAction {

    @Autowired
    WebClientService client;

    @Scheduled(fixedDelay = 1000)
    public void doWebCall() {
        try {
            String version = client.getVersion();
            System.out.println("Scheduled function running got "+version);
        } catch(Exception ex) {
            System.out.println("Scheduled function running got exception "+ex.getLocalizedMessage());
        }



    }

}
