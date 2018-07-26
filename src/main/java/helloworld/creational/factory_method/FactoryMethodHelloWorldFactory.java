package helloworld.creational.factory_method;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class FactoryMethodHelloWorldFactory implements HelloWorldFactory {

    @Override
    public HelloWorld createHelloWorld() {
        return () -> "Hello Factory Method!";
    }
}
