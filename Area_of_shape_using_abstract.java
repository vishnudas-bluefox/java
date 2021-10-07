import java.util.Scanner; //Import scanner library

abstract class shape {
    double x1,x2;
    shape(double a,double b){
        x1=a;
        x2=b;
    }
    abstract void printarea();
}

class rectangle extends shape {
    rectangle(double a, double b){
        super(a,b);
    }


    void printarea(){
        double area = x1*x2;
        System.out.println("The area of the rectangle is: "+ area
        );

    }
}

class circle extends shape{
    circle(double a,double b){
        super(a, b);
    }
    void printarea(){
        double area = 3.14 * x1 *x1;
        System.out.println("The area of circle using x1 is: " +area);

    }
}

class triangle extends shape{
    triangle(double a,double b){
        super(a, b);

    }
    void printarea(){
        double area = .5 * x1* x2;
        System.out.println("The area of the triangle is: " + area);

    }
}
public class Area_of_shape_using_abstract {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first Integer:");
        double int1 = sc.nextDouble();
        System.out.println("Enter the Second Integer:");
        double int2 = sc.nextDouble();

        shape sh;
        
        rectangle r = new rectangle(int1, int2);
        sh = r;
        sh.printarea();

        triangle t = new triangle(int1, int2);
        sh=t;
        sh.printarea();

        circle c = new circle(int1,int2);
        sh =c;
        sh.printarea();

    }
    
}
