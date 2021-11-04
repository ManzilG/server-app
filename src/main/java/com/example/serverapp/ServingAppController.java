package com.example.serverapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServingAppController {

   @GetMapping("/users")
    public ResponseEntity<String> getResponse() {
        return ResponseEntity.ok("{\n" +
                "  \"users\": [\n" +
                "    {\n" +
                "      \"name\" : \"Manzil\",\n" +
                "      \"age\" : 28,\n" +
                "      \"gender\" : \"M\",\n" +
                "      \"hobbies\" : null\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\" : \"Ramita\",\n" +
                "      \"age\" : 30,\n" +
                "      \"gender\" : \"F\",\n" +
                "      \"hobbies\" : [\n" +
                "        \"Sleeping\", \"Movies\"\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}");
    }
}
