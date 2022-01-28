package balaji.AssistedPractice;

public class Methodoverloading {
	public void area(int b,int h)
    {
         System.out.println("Area of Triangle : "+(0.5*b*h));
    }
    public void area(int r) 
    {
         System.out.println("Area of Circle : "+(3.14*r*r));
    }

    public static void main(String args[])
   {

Methodoverloading ob=new Methodoverloading();
       ob.area(20,22);
       ob.area(10);  
   }
}

