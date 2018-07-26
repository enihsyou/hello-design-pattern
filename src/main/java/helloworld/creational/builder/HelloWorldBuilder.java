package helloworld.creational.builder;

import helloworld.HelloWorld;
import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldBuilder {

    private String interjection;

    private String object;

    public static HelloWorldBuilder builder() {
        return new HelloWorldBuilder();
    }

    public HelloWorldBuilder interjection(String interjection) {
        this.interjection = interjection;
        return this;
    }

    public HelloWorldBuilder object(String object) {
        this.object = object;
        return this;
    }

    public HelloWorld getHelloWorld() {
        return new SplitHelloWorld(() -> interjection, () -> object);
    }

}
