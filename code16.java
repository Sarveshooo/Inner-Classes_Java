class outer
{
    int x=10;
    void fun()
    {
        System.out.println("in fun");
    }
    class inner
    {

    }
    void run()
    {
        System.out.println("IN RUN");
    }
    public static void main(String[] args) {
        outer obj=new outer();
        System.out.println(obj.x);
        obj.fun();
        obj.run();
    }
}
/*class client 
{
    public static void main(String[] args) {
        outer obj=new outer();
        obj.fun();
        obj.run();
        System.out.println(obj.x);
    }
}
*/