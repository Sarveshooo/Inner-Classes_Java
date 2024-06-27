class outer
{
    void fun()
    {
        System.out.println("IN FUN OUTER");
    }
}

    class inner extends outer
    {
        void fun()
        {
            System.out.println("IN FUN INNER");
        }
        void run()
        {
            System.out.println("IN RUN INNER");
        }
    }
    class inner2
    {
        public static void main(String[] args) 
        {

            outer obj=new outer();
            obj.fun();
          //  obj.run();

            inner obj2=new inner();
            obj2.fun();
            obj2.run();

            outer obj3=new inner();
            obj3.fun();
           // obj3.run();


            //inner obj4=new outer();
           // obj4.fun();
    }

    }
