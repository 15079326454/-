package com.zlq.Converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateConverter implements Converter<String, Date> {
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    /**
     *   converter方法的作用：将String类型转换为---->Date类型
     *   SimpleDateFormat sdf = new SimpleDateFormat();
     *   sdf.parset()
     * @param source 代表配置文件中的日期字符串 value="2020-12-16"
     * @return 当把转换好的Date作为converter方法的返回值后，spring自动的为birthday属性注入（赋值）
     */

    @Override
    public Date convert(String source) {
        Date date=null;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
             date = sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
