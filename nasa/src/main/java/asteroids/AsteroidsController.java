package asteroids;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsteroidsController {

    @RequestMapping("/")
    public String index() {
        return "Asteroids! They're everywhere!";
    }

}