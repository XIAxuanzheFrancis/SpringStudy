import com.xuanzhe.pojo.Student;
import com.xuanzhe.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    Student student = (Student) context.getBean("student", Student.class);
    System.out.println(student.getName());
    System.out.println(student.toString());

  }
  @Test
  public void test2(){
    ApplicationContext context = new ClassPathXmlApplicationContext("beanuserrrrr.xml");
    User user2 = (User) context.getBean("user2", User.class);
    System.out.println(user2);
  }

}
