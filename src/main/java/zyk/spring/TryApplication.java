package zyk.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TryApplication {

    public static void main(String[] args) {

        ApplicationContext context =
            new ClassPathXmlApplicationContext("Beans.xml");

        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();

    }

}
