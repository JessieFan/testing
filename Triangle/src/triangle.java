import java.util.Scanner;

public class triangle {

//	public static void main(String[] args) {
//	
//		Scanner sc = new Scanner(System.in);
//		  System.out.println("������a��ֵ");
//		  int a = sc.nextInt();
//		  System.out.println("������b��ֵ");
//		  int b = sc.nextInt();
//		  System.out.println("������c��ֵ");
//		  int c = sc.nextInt();
//		 // System.out.println("�߳�Ϊabc��" + test1(a, b, c));
//		  System.out.println("�߳�Ϊabc��" + test(a, b, c));
//
//	}
//	
	public static String test(int x, int y, int z) {
		  String s = "null";
		  if (x > 0 && y > 0 && z > 0) {
		   if (x + y > z && x + z > y && y + z > x) {
		    if (x == y || x == z || y == z) {

		     if (x == y && y == z) {
		      s = "�ǵȱ�������";
		     } else {
		      s = "�ǵ���������";
		     }
		    } else {
		     s = "����ͨ������";
		    }
		   } else {
		    s = "������������";
		   }

		  } else {
		   s = "������������";
		  }
		  return s;
		 }


		}


