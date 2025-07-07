package com.metabus.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JsonTest {

    @Test
    @DisplayName("Object to JSON : Get method 필요")
    void test1() throws JsonProcessingException{
        Star star = new Star ("Meta", 55);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(star);

        System.out.println("json Result : " + jsonString);


    }
}
