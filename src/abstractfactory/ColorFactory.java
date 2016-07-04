package abstractfactory;

/**
 * Created by mengjia on 16/7/4.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        if(color.equals("red")){
            return new Red();
        }else if(color.equals("blue")){
            return new Blue();
        }else{
            return null;
        }
    }

    @Override
    Draw getDraw(String draw) {
        return null;
    }
}
