package kettle.web_kettle.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface KettleDatabaseMapper {

    List<Map<String,String>> selectTest();

}
