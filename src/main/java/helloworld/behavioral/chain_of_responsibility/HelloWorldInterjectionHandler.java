package helloworld.behavioral.chain_of_responsibility;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldInterjectionHandler extends HelloWorldHandler {

    @Override
    public void handle(StringBuffer stringBuffer) {
        stringBuffer.append("Hello ");
    }
}
