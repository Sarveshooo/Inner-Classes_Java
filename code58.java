class pune
{
    void fun()
    {
        System.out.println("in pune fun");

    }
    pune()
    {
        System.out.println("puneee constructor");
    }
}
class mumbai
{
    void run()
    {
        System.out.println("IN RUN MUMBAI");
    }
    mumbai()
    {
        System.out.println("mumbai constructor");
    }
    public static void main(String[] args) {
        mumbai obj=new mumbai()
        {

        };
        mumbai obj2=new mumbai()
        {

        };
    }
}