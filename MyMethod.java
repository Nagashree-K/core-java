import java.util.*;
import java.lang.*;
import java.io.*;

public class MyMethod
	{
			public static void print()
			{
				System.out.println("He is printing");
			}
			
			public static void run()
			{
				System.out.println("He is running");
			}

			public static int add()
			{
				int a=10;
				int b=20;
				int c=a+b;
				return c;
			}
			
			public static float substract()
			{
				float a=10.5f;
				float b=5.5f;
				float c=a-b;
				return c;
			}

			public static String Display()
			{
				String a="hello java";
				return a;
			}

			public static char Show()
			{
				char a='A';
				return a;
			}

			public static short multiply()
			{
				short a=100;
				return a;
			}

			public static double division()
			{
				double a=2.5;
				double b=1.2;
				double c=a/b;
				return c;
			}
			
			public static boolean test()
			{
				boolean a=true;
				return a;
			}

			public static long check()
			{
				long a=1000L;
				long b=2000L;
				if(a>b)
				{
					return a;
				}
				else
				{
					return b;
				}
			}

			public static void main(String[] args)
			{
				print();

				run();

				int d=add();
				System.out.println(d);

				float f=substract();
				System.out.println(f);
				
				String s=Display();
				System.out.println(s);

				char c=Show();
				System.out.println(c);

				
				short t=multiply();
				System.out.println(t);

				double z=division();
				System.out.println(z);

			 	boolean m=test();
				System.out.println(m);

				long l=check();
				System.out.println(l);
			}
	}

				
				