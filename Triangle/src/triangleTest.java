import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {

	@Test
	public void test() {
		triangle triangle=new triangle();
		assertEquals("�ǵȱ�������",triangle.test(3,3,3));
		assertEquals("�ǵ���������",triangle.test(2,2,3));
		assertEquals("����ͨ������",triangle.test(3,4,5));
		assertEquals("������������",triangle.test(0,2,3));
		assertEquals("������������",triangle.test(1,2,3));
		
	}

}
