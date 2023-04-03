
import java.util.stream.*;

class mylist9
{
    public static void main(String args[])
    {

        Stream.iterate(1,i->i+1).limit(100).filter(a->a%2==0).forEach(System.out::println);



        //List<Integer> ln=Arrays.asList(5,6,7,8,2,3);
        /*for( int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }*/
    }
}