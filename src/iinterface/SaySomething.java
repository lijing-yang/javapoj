package iinterface;

import iinterface.Hello;
import iinterface.HelloWorld;

/**
 * Created by mengjia on 16/6/30.
 */

public class SaySomething {
    public static void main(String[] args){
        String mengjia = "mengjia";
        Test test = new Test(mengjia);

        HelloWorld h1 = new HelloWorld();
        System.out.println(h1.say(mengjia));


        test.setHello(h1);
        mengjia = test.update(mengjia);
        System.out.println(mengjia);

        Hello h2 = new Hello();
        test.setHello(h2);
        mengjia = test.lost(mengjia);
        System.out.println(mengjia);
    }
}
