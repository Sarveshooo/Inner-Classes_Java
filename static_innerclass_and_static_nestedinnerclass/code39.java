class outer
{
    static int x=100;
    static void fun()
    {
        System.out.println("in ststic fun");
    }

    outer()
    {
        System.out.println("IN OUTER CONSTRUCTOR");
    }

     class inner
    {
        int x=200;
        int y=1000;
         void run()
        {
            System.out.println("IN NON-STATIC RUN");

        }
        inner()
        {
            System.out.println("INNER CONSTRRUCTOR");
        }

    }
     public static void main(String[] args) {
        outer obj2=new outer();
        inner obj=obj2.new inner();
    }

}
