package abstractfactory;

/**
 * Created by mengjia on 16/7/4.
 */
public class DrawFactory extends AbstractFactory {

    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Draw getDraw(String draw) {
        if(draw.equals("circle")){
            return new Circle();
        }else if(draw.equals("rectangle")){
            return new Rectangle();
        }else{
            return null;
        }
    }
}
