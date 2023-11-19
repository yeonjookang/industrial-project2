package com.project.mealmate;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class DateFormatter {
    public static String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(date);
    }
}
