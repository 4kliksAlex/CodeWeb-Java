package io.github.kliksalex.codeweb.operationlayer.controller;

import io.github.kliksalex.codeweb.operationlayer.service.ProxyService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProxyController {

    private final ProxyService proxyService;

    private final RestTemplate restTemplate;

    @Value("${managementLayer.baseUrl}")
    private String managementLayerBaseUrl;

    public ProxyController(RestTemplate restTemplate, ProxyService proxyService) {
        this.restTemplate = restTemplate;
        this.proxyService = proxyService;
    }

    @RequestMapping("/**")
    public ResponseEntity<String> proxyRequest(HttpMethod method, @RequestBody(required = false) String body, HttpServletRequest request) throws Exception {
        String url = managementLayerBaseUrl + request.getRequestURI();
        return proxyService.proxyRequest(url);
//        HttpHeaders headers = new HttpHeaders();
//        Collections.list(request.getHeaderNames()).forEach(headerName ->
//                headers.put(headerName, Collections.list(request.getHeaders(headerName)))
//        );
//
//        HttpEntity<String> entity = new HttpEntity<>(body, headers);
//        ResponseEntity<String> response = restTemplate.exchange(url, method, entity, String.class);
//
//        return ResponseEntity.status(response.getStatusCode()).body(response.getBody());
    }
}