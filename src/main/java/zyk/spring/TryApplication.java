package zyk.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apache.log4j.Logger;

public class TryApplication {
    static Logger log = Logger.getLogger(TryApplication.class.getName());
    public static void main(String[] args) {
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("Beans.xml");
        log.info("Going to create HelloWord Obj");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        log.info("Exiting the program");
    }
}
