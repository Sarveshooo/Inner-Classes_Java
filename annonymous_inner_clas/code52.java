class parent 
{
    void career()
    {
        System.out.println("software devloper");

    }
}
class child extends parent
{
    void career()
    {
        System.out.println("youtuber");
    }
}
class uncle
{
    public static void main(String[] args) {
        child obj=new child();
        obj.career();
        
    }
    
}