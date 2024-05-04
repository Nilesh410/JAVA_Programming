class Demo
{
    Demo()
    {
        System.err.println("From constructor");
    }
    Demo(int a)
    {
        System.out.println("a:",a);
    }
}
public class Constructor_Example1 {
    public static void main(String[] args) {
        Demo d=new Demo();
        Demo d1=new Demo(1);

    }
}
