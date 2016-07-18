package com.example.springboot.web;

import com.example.springboot.domain.Hello;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.javafx.collections.MappingChange;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by xuning on 2016/7/18.
 */
@Component
@Path("Test")
@Produces({"application/javascript;charset=UTF-8", "application/json;charset=UTF-8", "text/javascript;charset=UTF-8"})
public class Test_1{
    private static final Log log= LogFactory.getLog(Test_1.class);
    @GET
    @Path("t1")
    public Object test_2(){
        Hello Hello = new Hello("147478","徐宁");
        String objectMapper=null;
        try {
            objectMapper=new ObjectMapper().writeValueAsString(Hello);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return objectMapper;
    }
}