package iinterface;

/**
 * Created by mengjia on 16/5/30.
 */

public class HelloWorld implements IHello {

    @Override
    public String say(String name) {

        String hi = "hello: " + name;
        return hi;
    }
}
