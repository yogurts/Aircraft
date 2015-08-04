package com.BaseClass;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * @author lili.sun
 * 对比旧的日期API

Java.time  java.util.Calendar以及Date
流畅的API	       不流畅的API
实例不可变        实例可变
线程安全           非线程安全
在处理时间上，最好选用JSR310（如果你用java8的话就实现310了），或者Joda-Time。

不止是java面临时间处理的尴尬，其他语言同样也遇到过类似的问题，比如
Arrow：Python 中更好的日期与时间处理库
Moment.js：JavaScript 中的日期库
Noda-Time：.NET 阵营的 Joda-Time 的复制
 *
 */
public class CalendarDate8 {

	public static void main(String[] args) {

		//使用默认时区时针瞬间时间创建clock.systemDefaultZone()
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//自定义时区
		LocalDateTime now2 = LocalDateTime.now(ZoneId.of("Europe/Paris"));
		LocalDateTime now3 = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
		System.out.println(now2);  //会以相应的时区显示日期
		System.out.println(now3);
		
		//构造一个对象
		LocalDateTime d1 = LocalDateTime.of(2015, 9, 03, 22, 30, 05);

		//解析String---LocalDateTime
		LocalDateTime d4 = LocalDateTime.parse("2015-09-03T22:30:05");
		System.out.println(d4);
		
		//使用DateTimeFormatter API 解析和格式化
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime d6 = LocalDateTime.parse("1985/09/03 22:30:05", formatter);
		System.out.println(formatter.format(d6));
		
		//时间获取
		System.out.println(d6.getYear());
		System.out.println(d6.getMonth());
		System.out.println(d6.getDayOfYear());
		System.out.println(d6.getDayOfMonth());
		System.out.println(d6.getDayOfWeek());
		System.out.println(d6.getHour());
		System.out.println(d6.getMinute());
		System.out.println(d6.getSecond());
		System.out.println(d6.getNano());
		
	}
	

}
