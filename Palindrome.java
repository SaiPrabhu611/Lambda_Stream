import java.util.*;
import java.io.*;
import java.util.stream.*;


public class Palindrome {
public static List<String> palindromeChecker(List<String> inputList)
{

List<String> palindromeList=new ArrayList<String>();
for(String a:inputList)
{

     String item=a.replaceAll("\\s+","").toLowerCase();
      if(IntStream.range(0,item.length()/2).noneMatch(j->item.charAt(j)!=item.charAt(item.length()-j-1)))
      {

          palindromeList.add(a);
      }

     
}

return palindromeList;

}



public static void main(String args[])
{
List<String> inputList=new ArrayList<String>();

System.out.println("Enter number of Strings to be checked for palindrome");
Scanner scan=new Scanner(System.in);

int count=scan.nextInt();

System.out.println("Enter "+count+"  strings separeted by space for palindrome checking");
for(int i=0;i<count;i++)
{

     String temp=scan.next();
     inputList.add(temp);



}

System.out.println("Palindromes from the given list are "+Palindrome.palindromeChecker(inputList));




scan.close();

}





    
}