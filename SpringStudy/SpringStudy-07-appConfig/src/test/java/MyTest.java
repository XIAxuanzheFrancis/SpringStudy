import com.xuanzhe.config.xiaConfig;
import com.xuanzhe.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(xiaConfig.class);
    User getUser = (User) context.getBean("getUser");
    System.out.println(getUser.getName());
  }
}
