abstract class Figure 
{	

	double dim1;
	double dim2;
	
	Figure(double dim1, double dim2)
	{
	
		this.dim1 = dim1;
		this.dim2 = dim2;
	
	}
	abstract double calArea();

}

class Rectangle extends Figure
{
	
	double rectArea;
	Rectangle(int width, int height)
	{
		super(width,height);
	}
	
	double calArea()
	{
	
		rectArea = dim1 * dim2;
		return rectArea;
	
	}
}

class Triangle extends Figure
{
	double triArea;
	
	Triangle (int  dim1, int dim2)

	{
		super(dim1,dim2);
	
	}

	double calArea()
	{
		triArea = dim1 * dim2 /2 ;
		
		return triArea;
	}
}

class FindArea
{
			
	public static void main(String [] args)
	{
	
	Figure fig;
	fig = new Rectangle(7,9);
	
	System.out.println("Rectangle Area = " + fig.calArea());
	fig = new Triangle(12,25);
	System.out.println("Triangle Area = " + fig.calArea());
	
	}

}