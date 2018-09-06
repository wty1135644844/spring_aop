package com.wty;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wty
 * @Version 1.0
 * @ClassName HelloTest
 * @date 2018/8/25 下午 03:23
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class HelloTest {
    @Resource
    private Hello hello;
    @Test
    public void  testInit(){
        Map<String ,String> map=new HashMap<>();
        map.put("price","200");
        hello.save(map);
    }
}
