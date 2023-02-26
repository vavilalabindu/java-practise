class employee{
    int empid;
    String empname;
    project emppro;
    employee(int eid,String ename,project epro)
    {

        empid=eid;
        empname=ename;
        emppro=epro;
    }



    public static void main(String args[])
    {
        project p1=new project(1,"worldtrips","bootstrap");
        project p2=new project(2,"cafe","javaScript");

        employee e1=new employee(3,"bindu",p1);
        employee e2=new employee(4,"tej",p2);

        e1.display();
        e2.display();

    }

   public void display()
    {

        System.out.println(empid+" is "+empname+" done the project "+emppro.projectname);
    }
}


class project{
    int projectid;
    String projectname,projecttech;

    project(int pid,String pname,String ptech)
    {
      projectid=pid;
      projectname=pname;
      projecttech=ptech;
    }
}