package com.example.securitytest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class WebClientService {

    @Value("${webclient.uri}")
    String uri;

    @Autowired
    WebClient client;


    public WebClient getWebclient() {
        return client;
    }

    public String getVersion() {
        WebClient webclient = getWebclient();
        Mono<String> res =
                webclient.get().uri(uri)
                .accept(MediaType.APPLICATION_STREAM_JSON)
                .retrieve()
                .bodyToMono(String.class);

        String result = res.block();

        return result;
    }
}
