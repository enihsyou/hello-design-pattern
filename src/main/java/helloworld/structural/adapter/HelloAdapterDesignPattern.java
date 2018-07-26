package helloworld.structural.adapter;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloAdapterDesignPattern {

    private String value;

    public HelloAdapterDesignPattern(String value) {
        this.value = value;
    }

    public String helloDesignPattern() {
        return value;
    }
}
