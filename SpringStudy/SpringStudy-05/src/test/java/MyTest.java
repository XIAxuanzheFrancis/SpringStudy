import com.xuanzhe.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
  @Test
  public void test1(){
    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    People people = context.getBean("people", People.class);
    System.out.println(people.toString());
  }
}
