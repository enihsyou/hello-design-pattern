package helloworld.behavioral.visitor;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldCharacterVisitor implements HelloWorldVisitor, HelloWorld {

    private StringBuffer accumulator;

    public HelloWorldCharacterVisitor() {
        this.accumulator = new StringBuffer();
    }

    @Override
    public void visit(HelloWorldElement helloWorldElement) {
        HelloWorldCharacterElement helloWorldCharacterElement = (HelloWorldCharacterElement) helloWorldElement;
        accumulator.append(helloWorldCharacterElement.getCh());
    }

    @Override
    public String helloWorld() {
        return accumulator.toString();
    }
}
