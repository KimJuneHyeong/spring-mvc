package com.metabus.springmvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Star;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class JsonTest {

    @Test
    @DisplayName("Object to JSON : Get method 필요")
    void test1() throws JsonProcessingException{
        Star star = new Star ("Meta", 55);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(star);

        System.out.println("json Result : " + jsonString);


    }

    void test2() throws JsonProcessingException{
        String json = "{\"name\" : \"NANA\",\"age\" : 95}";

        ObjectMapper objectMapper = new ObjectMapper();
        // json  문자열을 Star 클래스에 맞추어 값을 읽고 변환
        Star star = objectMapper.readValue(json,Star.class);
        System.out.println("name :" + star.getName());
        System.out.println("name :" + star.getAge());
    }
}
