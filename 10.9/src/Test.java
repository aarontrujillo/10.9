
public class Test
{
	private Shape shapeArray[];
	private TwoDimensionalShape twoDArray [];
	private ThreeDimensionalShape threeDArray [];
	
	public Test(){
		shapeArray = new Shape[4];
		twoDArray = new TwoDimensionalShape [2];
		threeDArray = new ThreeDimensionalShape [2];
		Circle circle = new Circle ( 22 , 88 ,21);
		shapeArray[0] = circle;
		twoDArray [0] = circle;
		
		Sphere sphere = new Sphere(8 , 89 , 78);
		shapeArray[1] = sphere;
		threeDArray [1] = sphere;
	}
		public void displayShapeInfo()
		{
			for (int i = 0; i < shapeArray.length; i++ )
			{
				System.out.println(shapeArray [i].getName() + " ; " );
			shapeArray[i].print();
			}
			
			
			for(int j = 0 ; j < twoDArray.length; j++)
				System.out.println(twoDArray[j].getName() +
						"s area is" + twoDArray [j].area());
			for (int k =0; k < threeDArray.length; k++)
			{
				System.out.println(threeDArray[k].getName() + "s area is " + 
			threeDArray [k].area());
				System.out.println(threeDArray[k].getName() + "s volume is " + 
			threeDArray [k].volume());
			}
		}
		public static void main(String [] args)
		{
			Test driver = new Test();
			driver.displayShapeInfo();
		}
	}
