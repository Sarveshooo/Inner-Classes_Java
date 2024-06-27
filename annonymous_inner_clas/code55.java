class pune
{
    void fun()
    {
        System.out.println("void fun pune");
    }
}
class mumbai
{
    void run()
    {
        System.out.println("in run mumbai");
    }
    public static void main(String[] args) {
        pune obj=new pune()
        {

        };
        obj.fun();
        /* 
        284 mumbai$1.class/////////////////////////////////////////////important/////////////////////
-a----        15-06-2024     22:54            560 mumbai.class
-a----        15-06-2024     22:54            391 pune.class
*/


    }

}