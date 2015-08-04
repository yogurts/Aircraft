package com.BaseClass;


import java.util.Calendar;

import static java.util.Calendar.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarDate {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.roll( MONTH, 1);
		System.out.println(calendar.get(MONTH) + "月" + calendar.get(DATE) + "日" + calendar.getTime());
	
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(formatter.format(date));
	
	}

}
