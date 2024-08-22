
import javax.swing.plaf.metal.MetalBorders;
import javax.swing.plaf.metal.MetalIconFactory;

class Farm{
    int len;
    int bre;
    Farm()
    {
        System.out.println("Default Constructor Invoked");
        {
            len=5;
            bre=5;
        }
    }
    Farm(int l,int b)
    {
        System.out.println("Parametric constructors invoked");
        len=l;
        bre=b;
    }
    Farm(int l)
    {
        len=l;
        bre=30;
    }
    void area()
    {
        System.out.println("Area"+(len*bre));
        class FarmExe
        {
            Farm f1=new Farm();
            System.out.println("the area of f1 object");
            f1.area();
            Farm f2=new Farm(10,20);
            System.out.println("the area of f2 obj");
            f2 .area();
            Farm f3=new Farm(40);
            System.out.prinln("the area of f3 obj");
            f3.area();
            
        }
    }
}
