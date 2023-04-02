//working with streamApi
//to print even numbers from array
import java.util.*;//to work with list Interface
import java.util.stream.*;//to work with streamApi
class mylist1b1
{
    public static void main(String b[])
    {
        List<Integer> ln=Arrays.asList(1,3,4,5,6,8,9);
        /*for(int a:ln)
        {
           if(a%2==0)
           {
             System.out.println(a); 
           }
        }*/


        ln.stream().filter(a->a%2==0).forEach(System.out::println);



        
    }
}