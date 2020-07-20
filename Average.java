import java.util.*;
import java.util.stream.IntStream;

public class Average
{

    public static void main(String args[])
    {
IntStream listItems=IntStream.range(25,50);

OptionalDouble a=listItems.average();
if(a.isPresent()){

    System.out.println("Average is:"+a.getAsDouble());
}
else
{

    System.out.println("Please check your list input values");
}


    }
}