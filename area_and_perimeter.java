import java .util.*; ///import scanner function

class circle  {
    double r;
    double pi =3.14;

    void area(){
        double area = r*r*3.14;
        System.out.println("The area of the circle is : " + area);


    }
    void perimeter(){
        double peri = 2*pi*r;
        System.out.println("The perimeter of the circle is : " + peri);        

    }


}

class circle_details{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in); //create scanner function

        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextInt(); //read the radius from user

        circle r1 = new circle();

        r1.r = r; //passing radius to  outer class
        r1.area(); //claculating and printing area
        r1.perimeter(); //calculating and print perimeter



    }
}
