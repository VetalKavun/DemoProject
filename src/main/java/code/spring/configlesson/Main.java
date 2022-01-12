package code.spring.configlesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SimpleBeanJSR250 simpleBeanImpl1 = (SimpleBeanJSR250) context.getBean("initJSR1");
        SimpleBeanJSR250 simpleBeanImpl2 = (SimpleBeanJSR250) context.getBean("initJSR2");
        SimpleBeanJSR250 simpleBeanImpl3 = (SimpleBeanJSR250) context.getBean("initJSR3");
        System.out.println(simpleBeanImpl1.toString());
        System.out.println(simpleBeanImpl2.toString());
        System.out.println(simpleBeanImpl3.toString());
    }
}
