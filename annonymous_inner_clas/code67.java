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
    }
    class inner2
    {
        public static void main(String[] args) 
        {

            outer obj=new outer();
            obj.fun();

            inner obj2=new inner();
            obj2.fun();

            outer obj3=new inner();
            obj3.fun();


            //inner obj4=new outer();
           // obj4.fun();
    }

    }
