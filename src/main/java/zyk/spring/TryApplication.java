package zyk.spring;

import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TryApplication {

    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext("Beans.xml");
    }

}
