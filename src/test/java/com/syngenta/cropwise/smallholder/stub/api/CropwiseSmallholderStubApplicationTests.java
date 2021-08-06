package com.syngenta.cropwise.smallholder.stub.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.syngenta.cropwise.smallholder.stub.api.fakeresource.controller.FakeResourceController;

@SpringBootTest
class CropwiseSmallholderStubApplicationTests {

    @Autowired
    private FakeResourceController fakeResourceController;

    @Test
    void contextLoads() {
        assertNotNull(fakeResourceController);
    }

    @Test
    void whenGetAllShouldReturnMap() {

        Map<String, Object> expectedReturn = new HashMap<>();
        expectedReturn.put("fake", "Resource");

        assertEquals(fakeResourceController.getAll(), expectedReturn);
    }
}
