package net.divineit.controller;

import net.divineit.FinalProjectMain;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FinalProjectController {

    static Logger logger = Logger.getLogger(FinalProjectMain.class);
    @RequestMapping("/home")
    public String home(Map<String, Object> model) {
        model.put("greet", "Welcome to Spring Boot!!!");
        logger.info("Home -- request -------------------------------------");
        return "home";
    }
}
