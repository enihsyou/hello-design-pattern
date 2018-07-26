package helloworld.behavioral.template_method;

import helloworld.HelloWorld;

/**
 * @author yihua.huang@dianping.com
 */
public abstract class AbstractHelloWorld implements HelloWorld {

    @Override
    public String helloWorld() {
        //noinspection StringBufferReplaceableByString
        StringBuilder accumulator = new StringBuilder();
        accumulator.append(getInterjection());
        accumulator.append(getSeparator());
        accumulator.append(getObject());
        accumulator.append(getTerminator());
        return accumulator.toString();
    }

    public abstract String getInterjection();

    public abstract String getSeparator();

    public abstract String getObject();

    public abstract String getTerminator();
}
