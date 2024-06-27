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
    }
    child()
    {
        System.out.println("child conss");
    }
    public static void main(String[] args) {
        child obj=new child();
        obj.fun();
        parent obj2=new parent();
       obj2.fun();
    }
}