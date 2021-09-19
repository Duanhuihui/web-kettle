package kettle.web_kettle.controller;



import kettle.web_kettle.service.KettleDatabase;
import kettle.web_kettle.service.impl.KettleDatabaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {


    private final KettleDatabase kettleDatabase;
    @Autowired
    public TestController (KettleDatabase kettleDatabase){
        this.kettleDatabase = kettleDatabase;
    }

    @GetMapping(value="/test")
    public String test(){
        List<Map<String, String>> test = kettleDatabase.getTest();
        return test.toString();
    }
}
