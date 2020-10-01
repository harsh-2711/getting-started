package daiict.slop.springboot_starterproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * created by Ekta on 01/10/2020
 */

@RestController
public class HealthController {

    /**
     * Api to check project is working correctly.
     * @return string
     */
    @RequestMapping("/health")
    public String checkProjectHealth() {
        return "project working correctly";
    }
}

