package io.github.kliksalex.codeweb.operationlayer.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@RestController
public class ProxyController {

    private final RestTemplate restTemplate;

    @Value("${managementLayer.baseUrl}")
    private String managementLayerBaseUrl;

    public ProxyController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/**")
    public ResponseEntity<String> proxyRequest(HttpMethod method, @RequestBody(required = false) String body, HttpServletRequest request) {
        String url = managementLayerBaseUrl + request.getRequestURI();
        HttpHeaders headers = new HttpHeaders();
        Collections.list(request.getHeaderNames()).forEach(headerName ->
                headers.put(headerName, Collections.list(request.getHeaders(headerName)))
        );

        HttpEntity<String> entity = new HttpEntity<>(body, headers);
        ResponseEntity<String> response = restTemplate.exchange(url, method, entity, String.class);

        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }
}