//program for reduce method
import java.util.*;
class mylist4
{
    public static void main(String args[])
    {
        List<Integer> ln=Arrays.asList(5,6,7,3,2);

        int sum=ln.stream().filter(a->a%2==0).reduce(0,(a,b)->a+b);
        System.out.println(sum);



        /*int sum=0;
        for(int i:ln)
        {
            if(i%2==0)
            {
             sum=sum+i;
            }
        }
        System.out.println(sum);*/
    }
}