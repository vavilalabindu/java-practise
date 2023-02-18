class library{

    public static void main(String args[])
    {
         bookshell bs=new bookshell();
         bs.setbook(1,"Immortals of Meluha","Amish",200);
         bs.getbook();

         bookshell bin=new bookshell();
         bin.setbook(2,"Chanakya's Chant","Ashwin Sangi",150);
         bin.getbook();

    }
}

class bookshell
{
    private int bid,bprice;
    private String bauthor,bname;



//adding one book to bookshell
 public void setbook(int bookid,String bookname,String bookauthor,int bookprice )
  {
    bid=bookid;
    bname=bookname;
    bauthor=bookauthor;
    bprice= bookprice;

  }

  //print book details
public void getbook()
{
System.out.println(bid+ " is "+bname+", written by "+bauthor+" and its price is "+bprice+" rs ");

}





}