package helloworld.creational.abstract_factory;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author yihua.huang@dianping.com
 */
public class AbstractFactory {

    private static final Map<Type, Class<? extends SplitHelloWorldFactory>> map;

    static {
        map = new EnumMap<>(Type.class);

        map.put(Type.Java, JavaSplitHelloWorldFactory.class);
        map.put(Type.DesignPattern, DesignPatternSplitHelloWorldFactory.class);
    }

    public static SplitHelloWorldFactory select(Type type) throws ReflectiveOperationException {
        return map.get(type).getConstructor().newInstance();
    }

    public enum Type {
        Java, DesignPattern
    }

}
