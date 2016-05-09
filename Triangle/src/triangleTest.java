import static org.junit.Assert.*;

import org.junit.Test;

public class triangleTest {

	@Test
	public void test() {
		triangle triangle=new triangle();
		assertEquals("是等边三角形",triangle.test(3,3,3));
		assertEquals("是等腰三角形",triangle.test(2,2,3));
		assertEquals("是普通三角形",triangle.test(3,4,5));
		assertEquals("不构成三角形",triangle.test(0,2,3));
		assertEquals("不构成三角形",triangle.test(1,2,3));
		
	}

}
