package helloworld.structural.facade;

import helloworld.HelloWorld;
import helloworld.creational.builder.HelloWorldBuilder;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldFacade {

    private final HelloWorld HELLO_WORLD;

    private HelloWorldFacade() {
        HELLO_WORLD = HelloWorldBuilder.builder().interjection("Hello").object("Facade").getHelloWorld();
    }

    /**
     * facade is usually used with singleton
     */
    public static HelloWorldFacade instance() {
        return HelloWorldFacadeInstanceHolder.INSTANCE;
    }

    private static class HelloWorldFacadeInstanceHolder {

        private final static HelloWorldFacade INSTANCE = new HelloWorldFacade();
    }

    public HelloWorld facadeHelloWorld() {
        return HELLO_WORLD;
    }

}
