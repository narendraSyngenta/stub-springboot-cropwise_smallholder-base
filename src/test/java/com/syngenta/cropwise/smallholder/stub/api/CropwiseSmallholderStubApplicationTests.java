package com.syngenta.cropwise.smallholder.stub.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.syngenta.cropwise.smallholder.stub.api.helloworld.controller.HelloWorldController;
import com.syngenta.cropwise.smallholder.stub.api.helloworld.data.request.GetAllQueryParams;


@SpringBootTest
class CropwiseSmallholderStubApplicationTests {

    @Autowired
    private HelloWorldController helloWorldController;

    @Test
    void contextLoads() {
        assertNotNull(helloWorldController);
    }

    @Test
    void whenGetAllShouldReturnMapList() {

        Map<String, Object> helloWorld1 = new HashMap<>();
        helloWorld1.put("hello", "World1");

        Map<String, Object> helloWorld2 = new HashMap<>();
        helloWorld2.put("hello", "World2");

        List<Map<String, Object>> expectedReturn = new ArrayList<>();
        expectedReturn.add(helloWorld1);
        expectedReturn.add(helloWorld2);

        assertEquals(helloWorldController.getAll(new GetAllQueryParams()), expectedReturn);
    }
}