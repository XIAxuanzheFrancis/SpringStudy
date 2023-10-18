import com.xuanzhe.service.UserService;
import com.xuanzhe.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  @org.junit.Test
  public void test1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserService userService = (UserService) context.getBean("userService");
    userService.add();
  }

}
