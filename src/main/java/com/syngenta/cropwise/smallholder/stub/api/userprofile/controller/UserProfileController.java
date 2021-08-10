package com.syngenta.cropwise.smallholder.stub.api.userprofile.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user-profiles")
public class UserProfileController {

    @PutMapping("/{id}")
    public Object update(@PathVariable String id, @RequestBody Object body) {
        return body;
    }

    @PostMapping
    public ResponseEntity<Object> create(@RequestBody Object body) throws URISyntaxException {
        return ResponseEntity.created(new URI("/api/v1/user-profiles/" + UUID.randomUUID().toString())).body(body);
    }
}
