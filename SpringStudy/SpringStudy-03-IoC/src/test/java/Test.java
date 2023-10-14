import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xuanzhe.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class Test {
  public static void main(String[] args) {
    //new User();
    ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    User user = (User) context.getBean("user");
    System.out.println(user.toString());
  }
}
