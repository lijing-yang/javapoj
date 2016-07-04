package iinterface;

import iinterface.IHello;

/**
 * Created by mengjia on 16/6/30.
 */
public class Test {
    private IHello hello;
    public String response = null;

    public Test(String name){
        response = name;
    }

    public String update(String name){
        if(this.hello != null ) response = this.hello.say(name);
        return response;
    }

    public String lost(String name){
        if(this.hello != null) response = hello.say(name);
        return response;
    }

    public void setHello(IHello hello) {this.hello = hello;}
}
