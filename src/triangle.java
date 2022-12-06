public class triangle {
    static double area=0;
    static double circumference=0;
    void getArea(double base, double height)
    {
        area= 0.5*base*height;
        System.out.println("area: "+area);
    }
    void getCirum(double l1, double l2,double l3)
    {
        circumference= l1+l2+l3;
        System.out.println("circumference: "+circumference);
    }

}
