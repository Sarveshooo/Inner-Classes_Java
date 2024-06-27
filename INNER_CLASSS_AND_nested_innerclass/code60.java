class outer
{
    outer()
    {
        System.out.println("IN OUTER CONSTRUCTOR");
    }
    class inner1
    {
        inner1()
        {

        
        System.out.println("IN INNER1 CONSTRUCTOR");
        }

    class inner2
    {
        inner2()
        {
            System.out.println("IN INNER2 CONSTRUCTOR");

        }
    }

}
public static void main(String[] args) {
    outer a = new outer();
    inner1 b = a.new inner1();
   inner1.inner2 c= b.new inner2();

}
}