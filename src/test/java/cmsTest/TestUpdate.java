package cmsTest;
import static org.junit.Assert.*;
import org.junit.Test;
public class TestUpdate {
	@Test
	public void test() throws Exception{
		LogicUpdate upd = new LogicUpdate();
		int x = upd.update();
		assertEquals(1,x);
	}
}
