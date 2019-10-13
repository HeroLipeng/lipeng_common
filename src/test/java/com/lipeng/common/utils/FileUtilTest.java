package com.lipeng.common.utils;

import java.io.File;

import org.junit.Test;

/**
 * @作者：李鹏
 *@date
 */
public class FileUtilTest {

	
	@Test
	public void testGetExtendName() {
		String fileName="1706d.jsp";
		FileUtil.getExtendName(fileName);
	}

	
	@Test
	public void testGetTempDirectory() {
		File file=FileUtil.getTempDirectory();
		System.out.println(file);
	}

	
	@Test
	public void testGetUserDirectory() {
		File file=FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
