package cmsTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsert {

	@Test
	public void test() throws Exception{
		LogicInsert obj = new LogicInsert();
		int x = obj.res();
		assertEquals(1,x);
	}

}
