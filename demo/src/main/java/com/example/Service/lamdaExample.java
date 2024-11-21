package com.example.Service;

import java.util.function.Function;

interface InterfaceExample {
     void draw();



     default void msg()
     {
         System.out.println("Msg ");
     }
}
class Square implements InterfaceExample
{
    public void draw()
    {
        System.out.println("Square Drawn");
    }
}
class Circle implements InterfaceExample
{
    public void draw()
    {
        System.out.println("Circle Drawn");
    }
}
class Rectangle implements InterfaceExample
{
    public void draw()
    {
        System.out.println("Rectangle Drawn");
    }
    public void msg()
    {
        System.out.println("Rectangle Msg");
    }
}
public class lamdaExample{
    public static void main(String args[])
    {
        InterfaceExample shape1 = new Square();
        shape1.draw();
        shape1.msg();
        InterfaceExample shape2 = new Circle();
        shape2.draw();
        shape2.msg();
        InterfaceExample shape3 = new Rectangle();
        shape3.draw();
        shape3.msg();
        /*InterfaceExample interfaceCircle = () -> System.out.println("Circle Drawn");
        InterfaceExample interfaceRectangle = () -> System.out.println("Rectangle Drawn");

        interfaceCircle.draw();
        interfaceRectangle.draw();*/

        Function<Integer,Integer> function = (s)->{
            return s*s;
        };
           System.out.println (function.apply(10));
    }
}
