package com.lipeng.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/**
 * @作者：李鹏
 *@date
 */
public class DateUtilTest {

	
	@Test
	public void testGetDateByInitMonth() {
		Calendar c=Calendar.getInstance();
		c.set(2018,2, 23, 12, 12, 28);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}

	
	@Test
	public void testGetDateByFullMonth() {
		Calendar c=Calendar.getInstance();
		c.set(2012, 1, 23, 12, 12, 28);
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
	}
	@Test
	public void testSQL() {
		//月初
		Date initMonth=DateUtil.getDateByInitMonth(new Date());
		//月末
		Date fullMonth=DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sql="select * from t_order where create_time>='{1}' and create_time<='{2}'";
		//替换后的结果
		String sql2=sql.replace("{1}", sdf.format(initMonth)).replace("{2}", sdf.format(fullMonth));;
		System.out.println(sql2);
	}
	
	
	
	
	

}
