class outer
{
    outer()
    {
        System.out.println("OUTERRR CONSTRUCTOR");
    }
    class inner
    {
        inner()
        {
            System.out.println("INNNER CONSTRUCTOR");
            System.out.println("hiiiiiiiii");
        }

    }
    public static void main(String[] args) {
        outer.inner obj=new outer().new inner();
    }
}