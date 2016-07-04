package abstractfactory;

/**
 * Created by mengjia on 16/7/4.
 */
public class FactoryProductor {
    public static AbstractFactory getFactory(String factory){
        if(factory.equals("draw")){
            return new DrawFactory();
        }else if(factory.equals("color")){
            return new ColorFactory();
        }else{
            return null;
        }
    }
}
