package com.example.tepper;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ObjectMapperDemo {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public Employee readJsonWithObjectMapper() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee emp = objectMapper.readValue(new File("employee.json"), Employee.class);
        logger.info(emp.toString());
        return emp;
    }

}
