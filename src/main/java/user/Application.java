package user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        // 初始化所有的组件，并且根据依赖关系，把每个组件所依赖的其他组件给初始化，然后注入！

        /*
        依赖注入
        1.创建UserController - -> new UserController(User); - -> 需要另一个对象（组件）
        2.先创建User --> 创建User
         */


    }
}
