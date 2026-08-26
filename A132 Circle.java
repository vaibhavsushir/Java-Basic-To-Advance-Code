import java.util.Scanner;
class Circle{

    double RadiusInMm;
    Circle(double RadiusInMm){
        this.RadiusInMm = RadiusInMm;
    }
    double getcircumference(){
        return 2 * RadiusInMm * Math.PI;
    }
    double getarea(){
        return  Math.PI * Math.pow(RadiusInMm,2);
    }

    @Override
    public String toString() {
        return "Circle Props:RadiusInMm: "+RadiusInMm + ",Circumference In Mm: " +getcircumference()+",Area Of Circle: "+getarea();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To World Of Circle\n");
        System.out.print("Enter The Radius Of Circle: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle);

    }
}
