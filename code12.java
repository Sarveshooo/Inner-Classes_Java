class outer{
    int x=10;
    static int y=30;
    outer()
    {
        System.out.println("IN OUT CONSTRUCTOR");
    }
    class inner{
        static int z=80;
        int v=90;
        inner()
        {
            System.out.println("in inner conss");
            System.out.println(x);
            System.out.println(y);
            System.out.println(v);
        }
    }
    public static void main(String[] args) {
        outer outobj=new outer();
        inner obj=outobj.new inner();
    }
}/////////////////////////last code frm 12/06/2024