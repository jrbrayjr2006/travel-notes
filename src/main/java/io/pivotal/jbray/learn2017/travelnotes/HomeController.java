package io.pivotal.jbray.learn2017.travelnotes;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String,String> home() {
        Map<String,String> results = new HashMap<>();
        results.put("data", "ok");
        return results;
    }
}
