package com.len.web.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: Twinkle
 * Time: 2018/1/31 19:15
 */
//需要配置mvc文件
public class StrToDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(source);
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
