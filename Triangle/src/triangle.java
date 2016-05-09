import java.util.Scanner;

public class triangle {

//	public static void main(String[] args) {
//	
//		Scanner sc = new Scanner(System.in);
//		  System.out.println("请输入a的值");
//		  int a = sc.nextInt();
//		  System.out.println("请输入b的值");
//		  int b = sc.nextInt();
//		  System.out.println("请输入c的值");
//		  int c = sc.nextInt();
//		 // System.out.println("边长为abc：" + test1(a, b, c));
//		  System.out.println("边长为abc：" + test(a, b, c));
//
//	}
//	
	public static String test(int x, int y, int z) {
		  String s = "null";
		  if (x > 0 && y > 0 && z > 0) {
		   if (x + y > z && x + z > y && y + z > x) {
		    if (x == y || x == z || y == z) {

		     if (x == y && y == z) {
		      s = "是等边三角形";
		     } else {
		      s = "是等腰三角形";
		     }
		    } else {
		     s = "是普通三角形";
		    }
		   } else {
		    s = "不构成三角形";
		   }

		  } else {
		   s = "不构成三角形";
		  }
		  return s;
		 }


		}


