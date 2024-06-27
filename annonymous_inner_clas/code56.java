class pune
{
    pune()
    {
        System.out.println("IN PUNEEE");
    }
    void fun()
    {
        System.out.println("in puneeeee fun");
    }
}
class mumbai
{
    void run()
    {
        System.out.println("in mumbai run ");
    }
    mumbai()
    {
        System.out.println("IN MUMBAIII");
    }
    public static void main(String[] args) {
        mumbai obj=new mumbai()
        {

        };
        obj.run();
    }
}