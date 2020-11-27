package br.com.rubenszaes.beberagua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnNotify;
    private EditText editMinute;
    private TimePicker timePicker;

    private int hour;
    private int minute;
    private int interval;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNotify = findViewById(R.id.btn_notify);
        editMinute = findViewById(R.id.edit_txt_number_interval);
        timePicker = findViewById(R.id.time_picker);

        timePicker.setIs24HourView(true);

    }

    public void notifyClick(View view){
        String sInterval = editMinute.getText().toString();
        hour = timePicker.getCurrentHour();
        minute = timePicker.getCurrentMinute();
        interval = Integer.parseInt(sInterval);

        Log.d("Teste", "Hora: " + hour + " Minute: " + minute + " Intervalo: " + interval);
    }
}