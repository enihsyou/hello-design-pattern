package helloworld.behavioral.visitor;

import java.nio.CharBuffer;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yihua.huang@dianping.com
 */
public class HelloWorldCharacterElements implements HelloWorldElement {

    private List<HelloWorldCharacterElement> helloWorldCharacterElements;

    public HelloWorldCharacterElements(char... chars) {
        this.helloWorldCharacterElements =
            CharBuffer.wrap(chars)
                .chars()
                .mapToObj((ch) -> new HelloWorldCharacterElement((char) ch))
                .collect(Collectors.toList());
    }

    @Override
    public void accept(HelloWorldVisitor visitor) {
        helloWorldCharacterElements.forEach(visitor::visit);
    }
}
