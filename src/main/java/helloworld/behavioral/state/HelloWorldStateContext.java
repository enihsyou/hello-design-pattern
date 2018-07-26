package helloworld.behavioral.state;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldStateContext implements HelloWorld {

    private StringBuffer accumulator;

    private HelloWorldState state;

    public HelloWorldStateContext() {
        this.accumulator = new StringBuffer();
        this.state = new HelloWorldInterjectionState();
    }

    HelloWorldStateContext append(String word) {
        this.accumulator.append(word);
        return this;
    }

    public HelloWorldStateContext setState(HelloWorldState helloWorldState) {
        this.state = helloWorldState;
        return this;
    }

    public HelloWorldStateContext appendWord(String word) {
        this.state.append(this, word);
        return this;
    }

    @Override
    public String helloWorld() {
        return accumulator.toString();
    }

}
