package daiict.slop.springboot_starterproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * HealthController
 * @version 1.0
 * @since Oct 1, 2020
 */

@RestController
public class HealthController {
    /**
     * Health Check API
     * @return string
     */
    @RequestMapping("/health")
    public String checkProjectHealth() {
        return "project working correctly";
    }
}

