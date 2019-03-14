abstract class shape
{
             abstract void area();
	abstract void vol();
}
class circle extends shape
{
	int r=5;
	 void area()
	 {
	 	float are=3.14f*r*r;
	 	System.out.println("Area of circle "+are);
	 }
	 void vol()
	 {
	 	float volum=3.14f*r*r*r;
	 	System.out.println("Volume of circle "+volum);
	 }
}

class cone extends shape
{
	int b=3,h=4,r=6;
	 void area()
	 {
	 	float are=3.14f*r*h;
	 	System.out.println("Area of cone "+are);
	 }
	 void vol()
	 {
	 	float volum=0.33f*b*h;
	 	System.out.println("Volume of cone "+volum);
	 }
}

class cylinder extends shape
{
	int r=5,h=9;
	 void area()
	 {
	 	float are=(2*3.14f*r*r)+h*(2*3.14f*h);
	 	System.out.println("Area of circle "+are);
	 }
	 void vol()
	 {
	 	float volum=3.14f*r*r*h;
	 	System.out.println("Volume of circle "+volum);
	 }
}
public class abstractshape 
{
	   public static void main(String args[]) 
	  {
	  	shape t;
	  	circle c=new circle();
	  	t=c;
	  	t.area();
	  	t.vol();
	  	
	  	cone c1=new cone();
	  	t=c1;
	  	t.area();
	  	t.vol();
	   		
	  	cylinder c2=new cylinder();
	  	t=c2;
	  	t.area();
	  	t.vol();
    }
    
    
}
