import java.util.*;


//Exceptions

try
{
// some code that could throw an exception
}
catch (ExceptionName e)
{
// Fix the problem here
}
finally
{
// finish things up
}

//Searched in order
//First one to match “wins” and no others are checked
try
{
}
catch (RunTimeException e)
{
}
catch (ArithmeticException e)
{
}


//abstraction
public class ClassName implements InterfaceName{
public int methodName(){  // Concrete implementation
}
}

public class Apple extends Fruit implements Cloneable{
}
// extend a class and implement any number of interfaces

public abstract class Shape{ //abstract class - partial abstraction
public abstract void draw();
}

public interface Drawable{ //interface - full abstraction
void draw();
}

//generics
//A type becomes a parameter to a class and/or a method:
public class ClassName<T>{
}

enum Season { WINTER, SPRING, SUMMER, FALL }


//Code to shift array to the right

int[] s = {1, 2, 3};

int last = s.length - 1;

temp = s[last];

for (int i = last; i > 0; --i) {
    s[i] = s[i - 1];
}

s[0] = temp;


//For shifting array to the left, capture the first element in temp, loop would be

for (int i = 0; i < last; ++i) {
    s[i] = s[i + 1];
}

s[last] = temp;


//For reversing an array

int[] a = {1,2,3}

int[] temp = new int[a.length]

for(int i = 0; i <= a.length -1; ++i) {
    temp[i] = a[a.length - 1 - i];
    }
 //And then to shift it n times to the left or right, you put it in another loop and let it run n times
