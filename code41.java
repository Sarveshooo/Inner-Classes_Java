class outer
{
    static int x=100;
    static void fun()
    {
        System.out.println("in ststic fun");
    }
    private char[] y;

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
        outer obj=new outer();
        inner inobj=obj.new inner();
        System.out.println(x);
        System.out.println(inobj.y);
        fun();
        inobj.run();
    }
   

}