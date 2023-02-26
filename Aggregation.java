


class employee{
 int empid;
 String empname;
 address adr;
   
   employee(int eid,String ename,address ad)
   {
     empid=eid;
     empname=ename;
     adr=ad;


   }

   public static void main(String args[])
   {

     address a1=new address("hyd","telangana","india");
     address a2=new address("ban","karnataka","india");


     employee e1=new employee(1,"bindu",a1);
     employee e2=new employee(2,"tej",a2);

     e1.display();
     e2.display();

   }


   public void display()
   {
     System.out.println(empid+" is "+empname+" from "+adr.country);
   }


}

class address{
 String city;
 String state;
 String country;
    address(String c,String st,String co)
    {
     city=c;
     state=st;
     country=co;
    }

}