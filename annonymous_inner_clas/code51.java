////////////////annonymus inneer class code 1
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
        parent obj=new parent();
        obj.career();
        
    }
    
}