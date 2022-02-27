import java.util.*;
public class MultipleCatchBlock
{
public static void main(String args[])
{
try{
String s=args[0];
int x=Integer.parseInt(s);
int a=10/x;
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Plz Enter input value");
}
catch(ArithmeticException e)
{
System.out.println("Plz Enter no Zero value");
}
catch(NumberFormatException e)
{
System.out.println("Plz Enter Number");
}
}
}
