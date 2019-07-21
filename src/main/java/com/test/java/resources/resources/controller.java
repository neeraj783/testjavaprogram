package com.test.java.resources.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api(value=" test", description=" This is test")
public class controller {@ApiOperation(value="This Method return  ")
@RequestMapping("/sub")
public int sub () {
    int a = 20;
    int b = 10;

    return a-b;
}
}
