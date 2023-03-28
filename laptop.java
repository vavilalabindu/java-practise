//@FunctionalInterface

class laptop implements lenovo
{
    public static void main(String ...args)
    {
          laptop lp=new laptop();
          lp.Display();
    }
    public void Display()
    {
        System.out.println("display of lenovo");
    }
}


@FunctionalInterface
interface lenovo
{
    void Display();
    
}













































