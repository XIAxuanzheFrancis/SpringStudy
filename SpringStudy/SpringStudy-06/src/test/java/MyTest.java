import com.xuanzhe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  @Test
  public void test1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    User user = (User)context.getBean("user");
    System.out.println(user.name);
  }
}
