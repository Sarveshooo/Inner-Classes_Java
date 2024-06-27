class outer{

    int x=10;//10
    outer(int x)//100
    {
        System.out.println("outer constructor");
        System.out.println(x);//100
        System.out.println(this.x);//10
        //System.out.println(inner.this.x);
    }


    class inner{
        int x=50;//50
        inner(int x)//200
        {
            System.out.println("inner constructor");
            System.out.println(x);//200
            System.out.println(this.x);//50
            System.out.println(outer.this.x);//10
            System.out.println(inner.this.x);//50
        }
      
        }
        public static void main(String[] args) {
            outer outobj=new outer(100);
            inner obj=outobj.new inner(200);
    }
}