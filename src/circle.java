public class circle {
    static double area=0;
    static double circum=0;
    void areaC(double radius)
    {
        area= 3.14*radius*radius;
        System.out.println("area: "+area);
    }
    void circumC(double radius)
    {
        circum=2*3.14*radius;
        System.out.println("circumference: "+circum);
    }

}
