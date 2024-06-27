class outer
{
    static int x=30;
    static void fun()
    {

    }
    //////////////static can be used here 
    class inner//////////it is non static class 
    {
       // static int x=30;
       // static void fun()
       // {

       // }
////////////////static variable and func cannot be used in inner class 
    }

}