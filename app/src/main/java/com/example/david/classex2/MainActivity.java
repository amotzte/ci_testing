package com.example.david.classex2;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch s1 ;
    EditText t1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s1 = (Switch) findViewById(R.id.switch1);
        t1 = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button);

        b1.setEnabled(false);
        t1.setEnabled(false);
        s1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    b1.setEnabled(true);
                }else{
                    b1.setEnabled(false);
                    t1.setText("");
                }
            }
        });
    }
    public void onBClick(View view){
        t1.setTextColor(Color.RED);
        t1.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
        t1.setText("BOOM");
    }

}
