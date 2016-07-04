package abstractfactory;

/**
 * Created by mengjia on 16/7/4.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Draw getDraw(String draw);
}
