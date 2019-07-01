package user;

public class User {
    private String name;
    private String content;

    public User() {
        // default constructor for spring mapping
        // 不可以省略！spring这么规定的
    }

    public User(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
