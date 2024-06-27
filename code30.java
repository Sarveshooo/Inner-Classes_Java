//////////////////1st code of 14/06/24 friday
class outer
{
    int x=10;//10
    outer(int x)//50
    {
        System.out.println(x);//50
        System.out.println(this.x);//10
        System.out.println(this);//address
        System.out.println(outer.this.x);//10

    
    }
    public static void main(String[] args) {
        outer obj=new outer(50);
    }
}