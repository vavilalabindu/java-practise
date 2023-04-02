import java.util.*;
class mylist4
{
    public static void main(String args[])
    {
        List<Integer> ln=Arrays.asList(5,6,7,3,2);
        ln.stream().sorted().forEach(System.out::println);

    }

}