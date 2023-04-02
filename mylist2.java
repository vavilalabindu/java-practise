//multiple the list by 5

import java.util.*;//to work with list interface

class mylist2
{

    public static void main(String args[])
    {

   
    List<Integer> ln=Arrays.asList(5,6,7,4,2);
     
     ln.stream().map(a->a*5).forEach(System.out::println);




    //TRADINAL METHOD
    /*for(int i:ln)
    {
        System.out.println(i*5);
    }*/
     }
}