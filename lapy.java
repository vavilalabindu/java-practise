//@FunctionalInterface using lambda
class lapy
{
    public static void main(String args[])
    {
    lenovo lo=()->{System.out.println("Display of lenovo");};
    lo.Display();
    }
   
}
@FunctionalInterface
interface lenovo
{
    void Display();
    
}