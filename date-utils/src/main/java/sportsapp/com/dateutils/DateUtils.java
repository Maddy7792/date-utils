package sportsapp.com.dateutils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by dennis on 8/6/17.
 */

public class DateUtils {
    public static String getTime(Date date){
        SimpleDateFormat timeFormate = new SimpleDateFormat("kk:mm");
        return timeFormate.format(date);
    }
}
