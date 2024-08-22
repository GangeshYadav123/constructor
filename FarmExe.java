class Farm
{
    int len;
    int bre;

    // Constructor initializes the dimensions
    Farm()
    {
        len = 10;
        bre = 20;
    }

    // Method to calculate and display the area
    void area()
    {
        System.out.println("Area: " + (len * bre));
    }
}

public class FarmExe
{
    public static void main(String[] args)
    {
        // Create an instance of Farm
        Farm f = new Farm();
        
        // Call the method to display the area
        f.area();
    }
}
