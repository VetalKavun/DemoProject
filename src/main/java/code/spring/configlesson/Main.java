package code.spring.configlesson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SimpleBeanImpl simpleBeanImpl1 = (SimpleBeanImpl) context.getBean("initBean1");
        SimpleBeanImpl simpleBeanImpl2 = (SimpleBeanImpl) context.getBean("initBean2");
        SimpleBeanImpl simpleBeanImpl3 = (SimpleBeanImpl) context.getBean("initBean3");
        System.out.println(simpleBeanImpl1.toString());
        System.out.println(simpleBeanImpl2.toString());
        System.out.println(simpleBeanImpl3.toString());
    }
}
