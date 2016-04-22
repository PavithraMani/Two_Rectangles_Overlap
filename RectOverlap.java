
public class RectOverlap {

	public static void main(String a[]){
		//rectangle1 base x,y , width and height
		int x1=1;
		int y1=1;
		int w1=2;
		int h1=2;

		//rectangle2 base x,y , width and height
		int x2=3;
		int y2=1;
		int w2=1;
		int h2=2;

		int x11=x1+w1;
		int y11=y1+h1;

		int x22=x2+w2;
		int y22=y2+h2;

		boolean isOverLap = ((x1 < x22) && (x11 > x2) &&  (y1 < y22) && (y11 > y2));
		boolean isNonOverLap = (x1>=x22 || x11 <= x2 || y1 >= y22 || y11 <= y2);

		if(isNonOverLap && !isOverLap)
			System.out.println("The rectangles do not overlap");
		else
			System.out.println("The rectangles overlap");
	}
}
