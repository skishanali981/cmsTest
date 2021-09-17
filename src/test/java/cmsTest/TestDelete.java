package cmsTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDelete {

	@Test
	public void test() throws Exception{
		LogicDelete del = new LogicDelete();
		int x = del.delete();
		assertEquals(1,x);
	}

}
