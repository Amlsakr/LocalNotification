package aml.localnotification;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent( "com.singhajit.notificationDemo.channelId");
        PendingIntent broadCast = PendingIntent.getBroadcast(this , 100,intent , PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND , 5);
        alarmManager.setExact(AlarmManager.RTC_WAKEUP , calendar.getTimeInMillis() ,broadCast);
    }
}
