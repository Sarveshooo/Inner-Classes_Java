class parent
{
    void fun()
    {
        System.out.println("in fun parent ");
    }
    parent()
    {
        System.out.println("parent constructor");
    }
    
}
class child extends parent 
{
    void fun()
    {
        System.out.println("in child fun");
        super.fun();
    }
    child()
    {
        System.out.println("child conss");
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.fun();
       
    }
}