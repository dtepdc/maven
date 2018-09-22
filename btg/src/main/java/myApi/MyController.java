package mine;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from dtepdc!";
    }

}
