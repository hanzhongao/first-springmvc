package com.hza.springmvc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Create by hza
 * 2019-11-14 14:46
 */
public class MyDateConverter implements Converter<String, Date> {
    public Date convert(String s) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd") ;
        try {
            Date d = sdf.parse(s) ;
            return d ;
        } catch (ParseException e) {
            return null;
        }
    }
}
