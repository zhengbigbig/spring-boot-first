package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

// 告诉Spring，这是一个RESTful API的Controller
@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    // 原子操作, 因为Spring默认是支持多线程的处理请求

    //  当用户访问 /greeting 这个路径的时候，请Spring框架调用这个方法去执行相关的逻辑
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        // count += 1;return counter
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
        return String.format(template, name);
    }

    // 框架 -- 框架负责调用你的代码！
    // 库 -- 我们去调用库的代码！


}
