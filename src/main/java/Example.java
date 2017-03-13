import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dmalladi
 */
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/test")
    String test() {
        return "Success";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}
