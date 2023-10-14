import com.xuanzhe.dao.UserDaoImpl;
import com.xuanzhe.dao.UserDaoMysqlImpl;
import com.xuanzhe.dao.UserDaoOracleImpl;
import com.xuanzhe.service.UserService;
import com.xuanzhe.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
  public static void main(String[] args) {
   /* UserService userService = new UserServiceImpl();

    ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
    userService.getUser();*/
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
    userServiceImpl.getUser();
  }
}
