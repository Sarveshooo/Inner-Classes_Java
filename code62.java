class outer
{
    outer()
    {
        System.out.println("IN OUTER CONSTRUCTOR");
    }
    void fun()
    {
        System.out.println("IN OUTER FUN");
    
        
        class inner1
        {
            inner1()
            {
                System.out.println("IN INNER 1 CONSTRUCTOR");
            }
            inner1 obj2=new inner1();
        }
    }
    void run()
    {   
        System.out.println("IN RUNNN");
        class inner2
        {
            inner2()
            {
                System.out.println("IN INNER 2");

            }
            inner2 obj=new inner2();
        } 
    }
    public static void main(String[] args) {
        //outer objk=new outer();
       // objk.fun();
       // objk.run();
    }


}