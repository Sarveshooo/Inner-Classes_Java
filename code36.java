class outer
{
    outer()
    {
        System.out.println("IN OUTER");
    }
    static int x=50;
    static void fun()
    {
        System.out.println("in static fun");
    }

    class inner
    {
        inner()
        {
            System.out.println("IN INNER ");
        }
        int x=500;
        int y=2000;

        void run()
        {
            System.out.println("in non-static run");
        }

    }
    public static void main(String[] args) 
    {
        outer outobj=new outer();
        inner obj=outobj.new inner();
        System.out.println(x);
        fun();
        System.out.println(obj.y);
        System.out.println(obj.x);
        obj.run();
        
    }

}