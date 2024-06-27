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
        }

    }
    public static void main(String[] args) {
        outer obj=new outer();
        inner inobj=obj.new inner();}
    }



/*class client
{
    public static void main(String[] args) {
        outer obj=new outer();
        inner inobj=obj.new inner();
    }
}/*/