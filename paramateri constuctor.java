class Farm{
    int len;
    int bre;
    Farm(int l,int b)
    {
        System.out.println("constructor invoked");
        len=l;
        bre=b;
    }
    void area()
    {
        System.out.println("Area="+(len*bre));
    }
}
class FarmExe
{
    public static void main(String[] args);
    {
        Farm f=new Farm(10,20);
        f.area();
    }
}

    

