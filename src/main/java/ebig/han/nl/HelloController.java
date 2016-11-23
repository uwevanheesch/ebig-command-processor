package ebig.han.nl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class HelloController {

    private Log logger = LogFactory.getLog(HelloController.class);

    @RequestMapping("/")
    public String index() {
        this.logger.info("A slighter change");
        return "A message";
    }

}