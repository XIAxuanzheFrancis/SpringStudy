import com.xuanzhe.mapper.UserMapper;
import com.xuanzhe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  @Test
  public void test01(){
    ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
    UserMapper userMapper =  (UserMapper) context.getBean("userMapper");
    for(User user : userMapper.selectUser()){
      System.out.println(user);
    }
  }
}
