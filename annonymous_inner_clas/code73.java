class outer
{
    void fun()
    {
        System.out.println("IN FUN OUTER");
    }
    void run()
    {
        System.out.println("IN RUN OUTER");
    }
}
class inner
{
    public static void main(String[] args) {
        outer obj = new outer()
        {
            void fun()
            {
                System.out.println("IN FUN OUTER$1");
                run();//////////////////types in which run() from outer class can be called
            }
        };
        obj.fun();
        
    }

}