package helloworld.creational.abstract_factory;

import helloworld.SplitHelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public interface SplitHelloWorldFactory {

    SplitHelloWorld.HelloWorldInterjection createHelloWorldInterjection();

    SplitHelloWorld.HelloWorldObject createHelloWorldObject();
}
