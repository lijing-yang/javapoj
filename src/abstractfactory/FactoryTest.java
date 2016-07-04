package abstractfactory;

/**
 * Created by mengjia on 16/7/4.
 */
public class FactoryTest {
    public static void main(String[] args){
        AbstractFactory drawF = FactoryProductor.getFactory("draw");

        Draw circle = drawF.getDraw("circle");
        circle.shape();

        Draw rectangle = drawF.getDraw("rectangle");
        rectangle.shape();

        AbstractFactory colorF = FactoryProductor.getFactory("color");

        Color red = colorF.getColor("red");
        red.fill();

        Color blue = colorF.getColor("blue");
        blue.fill();

    }

}
