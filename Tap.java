import java.util.*;
import java.lang.*;
import java.io.*;
public class Tap
{
    static int divide(int firstValue,int secondValue,int thirdValue)
    {
        System.out.println("method with 3 parameters");
        int dividedValue=firstValue / secondValue /thirdValue;
        return dividedValue;
    } 
    static int divide(int firstValue,int secondValue)
    {
        System.out.println("method with 2 parameters");
        int dividedValue=firstValue/secondValue;
        return dividedValue;
    } 
    static int divide(int firstValue)
    {
        System.out.println("method with 1 parameters");
        return firstValue;
    } 

    static void charge(char firstValue)
    {
        System.out.println("method having char type parameters");
        System.out.println(firstValue);
    }
    static void charge(String firstValue)
    {
        System.out.println("method having String type parameters");
        System.out.println(firstValue);
    }
    static void charge(boolean firstValue)
    {
        System.out.println("method having boolean type parameters");
        System.out.println(firstValue);
    }

    static void open(int firstValue,float secondValue)
    {
        System.out.println(firstValue+" "+secondValue);
    }
    static void open(float secondValue,int firstValue)
    {
        System.out.println(secondValue+" "+firstValue);
    }

    public static void main(String[] args)
    {
        int FirstReturnedValue=divide(35,7,3);
        System.out.println(FirstReturnedValue);

        int SecondReturnedValue=divide(35,7);
        System.out.println(SecondReturnedValue);

        int ThirdReturnedValue=divide(35);
        System.out.println(ThirdReturnedValue);

        charge('N');
        charge("Invoking");
        charge(false);
        
        open(10,10.5f);
        open(20.2f,40);
           
     }
}