//////////////////////NESTED INNER CLASSSS 
class outer

{
    outer()
    {
        System.out.println("OUTER CONSTRUCTOR");
    }
    class inner1
    {
        inner1()
        {
            System.out.println(" IN INNER 1  CONSTRUCTOR");
        }
        class inner2
        {
            inner2()
            {
                System.out.println("IN INNER 2 CONSTRUCTOR");
            }
        }

    }
    public static void main(String[] args) {
        outer obj=new outer();
        inner1 inobj=obj.new inner1();
        inner1.inner2 in2obj=inobj.new inner2();

    }
}