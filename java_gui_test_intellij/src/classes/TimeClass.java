package classes;

import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TimeClass {

    public TimeClass(){}

    public String getTimeMilliSec(){
        String retVal, dateStr, milliStr;
        dateStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());

        Calendar calendar = Calendar.getInstance();
        long milliSeconds = calendar.getTimeInMillis();
        milliSeconds = milliSeconds % 1000;
        milliStr = Long.toString(milliSeconds);
        if(milliStr.length() < 2){
            milliStr = "00" + milliStr;
        }else if(milliStr.length() < 3){
            milliStr = "0" + milliStr;
        }
        retVal = dateStr + "." + milliStr;

        return retVal;
    }
}
