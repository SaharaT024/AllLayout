package com.gamerstyle.test2;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText ed1,ed2;
    Button btn1;

    float result_sum;
    float num1,num2;
    String result_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);

        btn1 = (Button)findViewById(R.id.btn1);
        };

    public void on1(View view) {
        num1 = Integer.parseInt(ed1.getText().toString());
        num2 = Integer.parseInt(ed2.getText().toString());

        result_sum = num1/(((num2/100)*(num2/100)));
        result.setText(String.valueOf(result_sum));

        if (result_sum < 18.5)
        {
            result.setText(result_sum+" Below Average ");
        }
        else if(result_sum >= 18.5 && result_sum < 22.9)
        {
            result.setText(result_sum+" Average ");
        }
        else if(result_sum >= 22.9 && result_sum < 24.9)
        {
            result.setText(result_sum+" Above Average ");
        }
        else if(result_sum >= 24.9 && result_sum < 29.9)
        {
            result.setText(result_sum+" FAT ");
        }
        else if (result_sum >= 29.9)
        {
            result.setText(result_sum+" Very Fat");
        }
    }
}
