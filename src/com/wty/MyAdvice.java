package com.wty;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Map;

/**
 * @author wty
 * @Version 1.0
 * @ClassName MyAdvice
 * @date 2018/8/25 下午 03:17
 */
public class MyAdvice {

    public void myBefore(JoinPoint jp){
        Object[] args=jp.getArgs();
        Map<String,String> map=(Map<String,String>)args[0];
        double price=Double.parseDouble(map.get("price"))*0.8;
        map.put("price",price+"");
        System.out.print("<<");
    }
    public void myAfter(){
        System.out.println(">>");
    }
    public void afterreturn(JoinPoint jp,Object rst){

    }

    public void throwing(JoinPoint jp,Exception ex){

    }

    public Object around(ProceedingJoinPoint pjp){

        Object obj=null;

        try {
            obj=pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        return obj;
    }
}
