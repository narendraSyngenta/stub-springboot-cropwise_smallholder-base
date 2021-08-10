package com.syngenta.cropwise.smallholder.stub.api.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/hello-world")
public class HelloWorldController {
//
//    @GetMapping
//    public List<Map<String, Object>> getAll(GetAllQueryParams queryParams) {
//
////        log.info("param1 = {}", queryParams.getParam1());
////        log.info("param2 = {}", queryParams.getParam2());
//
//        return jsonStringToMapList("[{\"hello\": \"World1\"}, {\"hello\": \"World2\"}]");
//    }
//
//    @GetMapping("/{id}")
//    public Map<String, Object> getById(@PathVariable String id) {
//        return jsonStringToMap("{\"hello\": \"World\", \"id\": " + id + "}");
//    }
//
//    @PutMapping("/{id}")
//    public Map<String, Object> update(@PathVariable String id, @RequestBody Object body) {
//        return jsonStringToMap(objectToJsonString(body));
//    }
}
