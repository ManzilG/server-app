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
                "      \"age\" : 26,\n" +
                "      \"gender\" : \"M\",\n" +
                "      \"hobbies\" : null\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\" : \"John\",\n" +
                "      \"age\" : 30,\n" +
                "      \"gender\" : \"M\",\n" +
                "      \"hobbies\" : [\n" +
                "        \"Sleeping\", \"Movies\"\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}");
    }
}
