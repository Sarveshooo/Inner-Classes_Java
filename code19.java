class outer{
    int x=10;
    static int y=90;
    outer()
    {
        System.out.println("in outttttt");
    }
    void fun()
    {
        System.out.println("in funnnnn");
    }
    class inner{
        void run()
        {
            System.out.println("in runnnnn");
        }
    }
    public static void main(String[] args) {
        outer obj=new outer();
        inner outobj=obj.new inner();
        outer.inner objx=new outer().new inner();
        obj.fun();
        System.out.println(y);
        System.out.println(obj.x);
       outobj.run();

    }
/////////////////////last code of 11/06/2024

}