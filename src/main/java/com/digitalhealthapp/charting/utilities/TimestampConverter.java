package com.digitalhealthapp.charting.utilities;

import java.sql.Timestamp;

public class TimestampConverter {

        java.util.Date dt = new java.util.Date();

    java.text.SimpleDateFormat sdf =
            new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    Timestamp getConverted(){
    String currentTime = sdf.format(dt);
    return Timestamp.valueOf(currentTime);}
}
