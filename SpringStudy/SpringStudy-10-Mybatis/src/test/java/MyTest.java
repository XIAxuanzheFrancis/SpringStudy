import com.xuanzhe.mapper.UserMapper;
import com.xuanzhe.pojo.User;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.core.io.Resource;

public class MyTest {
  @Test
  public void test() throws IOException {
    String resources = "mybatis-config.xml";
    InputStream i = Resources.getResourceAsStream(resources);
    SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(i);
    SqlSession sqlSession = sessionFactory.openSession(true);
    UserMapper mapper = (UserMapper) sqlSession.getMapper(UserMapper.class);
    List<User> userList = mapper.selectUser();

    for(User user : userList){
      System.out.println(user);
    }
  }
}
