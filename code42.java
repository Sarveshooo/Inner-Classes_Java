class demo
{
    static int x=100;
    static void fun()
    {
        System.out.println("IN STATIC FUN");
    }
    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }
}