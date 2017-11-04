package com.example.duynguyen.scrollie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public Button button12;

    public void init(){
        button12 = (Button)findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(MainActivity.this,two.class);
                startActivity(toy);
            }
        });
    }

    private void changeTextViewValue(){
        final TextView changingText = (TextView)findViewById(R.id.text_to_change);
        Button changeTextButton = (Button)findViewById(R.id.change_text_button);

        changeTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* changingText.setText(pickUpLines[i++]); */
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeTextViewValue();

        init();
    }
}
