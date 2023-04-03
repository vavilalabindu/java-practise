
import java.util.*;
class mylist6
{
    public static void main(String ar[])
    {
       List<String> ln=Arrays.asList("bs","bin","tej","suu");

       ln.stream().filter(a->a.startsWith("b")).forEach(System.out::println);

       /*for(String a:ln)
       {
        if(a.startsWith("b"))
        {
            System.out.println(a);
        }
       }*/


    }}