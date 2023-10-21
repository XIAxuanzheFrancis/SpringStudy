import com.xuanzhe.mapper.UserMapper;
import com.xuanzhe.pojo.User;
import java.io.IOException;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

  @Test
  public void test() throws IOException {

    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserMapper userMapper = (UserMapper) context.getBean("userMapper");
    List<User> userList = userMapper.selectUser();
    for (User user : userList) {
      System.out.println(user);
    }
//    userMapper.addUser(new User(5,"夏烜哲","654321"));
//    userMapper.deleteUser(1);
//    userList = userMapper.selectUser();
//    for (User user : userList) {
//      System.out.println(user);
//    }
  }
}
