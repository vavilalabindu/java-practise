//t0 count no of empty strings in list
import java.util.*;
class mylist6
{
    public static void main(String ar[])
    {
        List<String> ln=Arrays.asList("bs","bin","","tej","","");

        long num=ln.stream().filter(a->a.isEmpty()).count();
        System.out.println("total empty strings are "+num);



        /*int count=0;
        for(String a:ln)
        {
            if(a.isEmpty())
            {
                count++;
            }
        }
        System.out.println(count);*/

    } 
}