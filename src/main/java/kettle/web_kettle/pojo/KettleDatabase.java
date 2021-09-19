package kettle.web_kettle.pojo;

import lombok.Data;

@Data
public class KettleDatabase {
    private Integer id;
    private String name;
    private Integer objectId;
    private String description;
    private String type;
    private String database;
    private String part;
    private String url;
    private String password;
    private String user;
}
