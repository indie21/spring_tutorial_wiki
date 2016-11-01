package zyk.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldTest {

    @Test
    public void tryTest() {
        HelloWorld h = new HelloWorld();
        h.setMessage("good");
        System.out.printf("try to run test:%s \n", h.getMessage());
    }

}
