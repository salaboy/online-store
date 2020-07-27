package com.salaboy.lke;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@Controller
class SiteController {
    @Value("${version:0.0.0}")
    private String version;

    @Value("${PRODUCT_SERVICE:http://products-service}")
    private String PRODUCT_SERVICE;

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("version", version);

        try {
            ResponseEntity<String> productServiceVersion = restTemplate.getForEntity(PRODUCT_SERVICE + "/info", String.class);
            model.addAttribute("productService", productServiceVersion.getBody());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }

}

