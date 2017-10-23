package com.example.arif.timepicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends Activity {

    private TimePicker timePicker;
    private Button button;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker) findViewById(R.id.timePickerID);
        timePicker.setIs24HourView(true);
        button = (Button) findViewById(R.id.buttonID);
        textView = (TextView) findViewById(R.id.textViewID);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String time = timePicker.getCurrentHour()+";"+timePicker.getCurrentMinute();
                textView.setText(time);
            }
        });
    }
}
