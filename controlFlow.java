import java.util.*;
class student{
    String name;
    int marks;
    boolean checkPass()
    {
        // if(marks>40)
        // {
        //     return true;
        // }
        // else{
        //     return false;
        // }
        if(marks>40) return true;
        return false;
    }
}



public class controlFlow {

    int findMax(int a, int b, int c)
    {
        if(a>b&&a>c) return a;
        else if(b>a&&b>c) return b;
        else return c;
    }

    public static void main(String args[])
    {
        student s1=new student();
        s1.name="Ram";
        s1.marks=80;
        student s2=new student();
        s2.name="Shyam";
        s2.marks=30;
        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());


        controlFlow cf=new controlFlow();
        System.out.println("Highest : "+ cf.findMax(12,04,23));

        char c='a';
        switch(c)
        {
            case 'a':
            System.out.println("Hey, I'm a");
            break;
            case 'b':
            System.out.println("Hey, I'm b");
            break;
            case 'c':
            System.out.println("Hey, I'm c");
            break;
            default : 
            System.out.println("Hey, I'm not a, not b nor c.");
            break;

        }

    }
}
