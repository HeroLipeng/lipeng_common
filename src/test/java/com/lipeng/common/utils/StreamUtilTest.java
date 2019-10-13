package com.lipeng.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/**
 * @作者：李鹏
 *@date
 */
public class StreamUtilTest {

	
	@Test
	public void testCloseAll() {
		
	}

	
	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException {
		String str=StreamUtil.readTextFile(new FileInputStream(new File("D:/java.txt")));
		System.out.println(str);
	}

	
	@Test
	public void testReadTextFileFile() {
		String string=StreamUtil.readTextFile(new File("D:/java.txt"));
		System.out.println(string);
	}

}
