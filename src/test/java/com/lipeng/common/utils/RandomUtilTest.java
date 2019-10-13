package com.lipeng.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @作者：李鹏
 *@date
 */
public class RandomUtilTest {

	
	@Test
	public void testRandom() {
		int i = RandomUtil.random(1, 10);
		System.out.println(i);
	}

	
	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 10, 6);
		for (int i : is) {
			System.out.println(i);
		}
	}

	
	@Test
	public void testRandomCharacter() {
		char c = RandomUtil.randomCharacter();
		System.out.println(c);
	}

	
	@Test
	public void testRandomString() {
		String string = RandomUtil.randomString(4);
		System.out.println(string);
	}

}
