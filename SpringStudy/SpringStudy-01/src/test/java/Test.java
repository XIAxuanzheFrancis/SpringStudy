import com.xuanzhe.dao.UserDaoImpl;
import com.xuanzhe.dao.UserDaoMysqlImpl;
import com.xuanzhe.dao.UserDaoOracleImpl;
import com.xuanzhe.service.UserService;
import com.xuanzhe.service.UserServiceImpl;

public class Test {
  public static void main(String[] args) {
    UserService userService = new UserServiceImpl();

    ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
    userService.getUser();
  }
}
