import java.util.Scanner;

class DistanceBwPoint {

	public static void main(String arg[])

	{

		int x1, x2, y1, y2, x3, x4, y3, y4;
		double dis;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter x1 point");

		x1 = sc.nextInt();

		System.out.println("Enter y1 point");

		y1 = sc.nextInt();

		System.out.println("Enter x2 point");

		x2 = sc.nextInt();
		System.out.println("Enter y2 point");

		y2 = sc.nextInt();
		System.out.println("Enter x3 point");

		x3 = sc.nextInt();
		System.out.println("Enter y3 point");

		y3 = sc.nextInt();
		System.out.println("Enter x4 point");

		x4 = sc.nextInt();
		System.out.println("Enter y4 point");

		y4 = sc.nextInt();
		sc.close();

		dis = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Welcome to Line\r\n" + "Comparison Computation\r\n" + "Program on Master Branch");
		System.out.println("Length of a line between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")===>" + dis);
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
		if (length1 == length2)
			System.out.println(length1 + " and " + length2 + " are equal");
		else if (length1 > length2)
			System.out.println(length1 + " Length1 is the Greater");
		else
			System.out.println(length2 + " Length2 is the Greater");
	}
}
