/*Write a java program to calculate first and last date of a week.
  Output:
  First Date of Week:             Mon 24/07/2017
  Last date of the week:          Sun 30/07/2017
*/
package com.stackroute.PE3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.time.*;
import java.text.*;

public class CalculateDateOfTheWeek {
    public String calculateDateOfWeek(){
        String day= "";
        DateFormat formatdate = new SimpleDateFormat("EEE dd/MM/yyyy");
        Calendar calender = Calendar.getInstance();

        // Set the calendar to monday of the current week
        calender.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        day = formatdate.format(calender.getTime())+"\n";

        // Print dates of the current week starting on Monday
        System.out.println(formatdate.format(calender.getTime()));
        for (int i = 0; i < 6; i++) {
            calender.add(Calendar.DATE, 1);
        }
        day = day+formatdate.format(calender.getTime());
        return day;    }
}
