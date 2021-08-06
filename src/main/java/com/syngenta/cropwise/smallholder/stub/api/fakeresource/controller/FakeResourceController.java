package com.syngenta.cropwise.smallholder.stub.api.fakeresource.controller;

import static com.syngenta.cropwise.smallholder.stub.utils.ControllerUtils.jsonStringToMap;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/fake-resource")
public class FakeResourceController {

    @GetMapping
    public Map<String, Object> getAll() {
        return jsonStringToMap("{\"fake\": \"Resource\"}");
    }
}
