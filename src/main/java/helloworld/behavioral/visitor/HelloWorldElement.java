package helloworld.behavioral.visitor;

/**
 * @author yihua.huang@dianping.com
 */
public interface HelloWorldElement {

    void accept(HelloWorldVisitor visitor);
}
