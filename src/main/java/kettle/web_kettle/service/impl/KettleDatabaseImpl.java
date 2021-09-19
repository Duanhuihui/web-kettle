package kettle.web_kettle.service.impl;

import kettle.web_kettle.mapper.KettleDatabaseMapper;
import kettle.web_kettle.service.KettleDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class KettleDatabaseImpl implements KettleDatabase {
    private final KettleDatabaseMapper kettleDatabaseMapper;
    @Autowired
    public  KettleDatabaseImpl (KettleDatabaseMapper kettleDatabaseMapper){
        this.kettleDatabaseMapper = kettleDatabaseMapper;
    }
    @Override
    public List<Map<String, String>> getTest() {
        return kettleDatabaseMapper.selectTest();
    }


}
