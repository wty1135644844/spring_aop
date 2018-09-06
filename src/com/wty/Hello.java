package com.wty;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author wty
 * @Version 1.0
 * @ClassName Hello
 * @date 2018/8/25 下午 03:16
 */
@Component
public class Hello {
    public void print(){
        System.out.print("a");
    }
    public String show(){
        System.out.print("show");
        return "hello";
    }

    public int save(Map<String,String> map){
        int row=0;
        System.out.print(map);
        return row;
    }
}
