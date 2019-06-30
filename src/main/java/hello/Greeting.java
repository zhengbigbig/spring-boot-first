package hello;

// Spring 会自动调用这个类的getter方法，获取成员变量值，
// 然后构建一个json的返回结果
public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public int test() {
        int a = 1;
        int b = 2;
        return a + b;
    }
}
