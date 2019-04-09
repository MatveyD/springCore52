import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-core.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.getAllUsers();

    }

}
