package ebig.han.nl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        System.out.println("Change");
        return "This is a message is a branch.";
    }

}