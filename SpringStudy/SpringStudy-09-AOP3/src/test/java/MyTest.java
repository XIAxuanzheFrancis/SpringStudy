import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xuanzhe.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  @Test
  public void test1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    UserService userservice = (UserService) context.getBean("userService");
    userservice.select();
  }

}
