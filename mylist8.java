//print non empty strings in newlist
import java.util.*;
import java.util.stream.*;
class mylist6
{
    public static void main(String ar[])
    {
       List<String> ln=Arrays.asList("bs","bin","","","tej","suu");
    List<String> newlist=ln.stream().filter(a->!a.isEmpty()).collect(Collectors.toList());
            System.out.println("original list : "+ln);
            System.out.println("updated list : "+newlist);

        List<String> uppercaselist=newlist.stream().map(a->a.toUpperCase()).collect(Collectors.toList());    
System.out.println("uppercase list : "+uppercaselist);

       /*for(String a:ln)
       {
        if(!a.isEmpty())
        {
            System.out.println(a);
        }
       }*/

    }}