package iinterface;

/**
 * Created by mengjia on 16/6/30.
 */
public class Hello implements IHello {

    @Override
    public String say(String name) {
        return "please see me";
    }
}
