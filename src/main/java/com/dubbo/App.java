package com.dubbo;

import com.dubbo.inter.DubboService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"dubbo-consumer.xml"});
        context.start();
        // obtain proxy object for remote invocation
        DubboService dubboService = (DubboService) context.getBean("dubboServiceImpl");
        // execute remote invocation
        String hello = dubboService.getMessage();
        // show the result
        System.out.println(hello);
    }
}
