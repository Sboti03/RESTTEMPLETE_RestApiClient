package org.example;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;

public class Main {


    public static void main(String[] args) {

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:3000/api/auth/login";
        HttpEntity<LoginData> request = new HttpEntity<>(new LoginData("admin@muscles.com", "admin"));
        ResponseEntity<LoginResponse> response= restTemplate.postForEntity(url, request, LoginResponse.class);
        LoginResponse body = response.getBody();
        System.out.println(body);

    }
}