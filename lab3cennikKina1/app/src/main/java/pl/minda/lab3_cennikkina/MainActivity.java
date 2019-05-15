package pl.minda.lab3_cennikkina;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    ImageView imageViewLogo;
    ImageButton imageButtonOK;
    Boolean nightMode=false;
    Boolean acceptRuels=false;
    Switch aSwitchNightMode;
    TextView textList;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewLogo = findViewById(R.id.imageView);
        imageButtonOK = findViewById(R.id.imageButton);

        checkBox = findViewById(R.id.checkBox2);

        constraintLayout = findViewById(R.id.mainView);

        textList = findViewById(R.id.textList);



        aSwitchNightMode = findViewById(R.id.switch1);

        imageViewLogo.setImageResource(Integer.parseInt(String.valueOf(R.drawable.logohelios)));
        imageButtonOK.setImageResource(Integer.parseInt(String.valueOf(R.drawable.ok)));
        textList.setText(R.string.scrolView);

        aSwitchNightMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getApplicationContext(),"NightMode ON",Toast.LENGTH_SHORT).show();
                    constraintLayout.setBackgroundColor(Color.GRAY);
                    nightMode = true;
                } else {
                    Toast.makeText(getApplicationContext(),"NightMode OFF",Toast.LENGTH_SHORT).show();
                    constraintLayout.setBackgroundColor(Color.WHITE);
                    nightMode = false;
                }
            }
        });

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    acceptRuels = true;
                    Toast.makeText(getApplicationContext(),"Regulamin zatwierdzony",Toast.LENGTH_SHORT).show();
                }
                else {
                    acceptRuels = false;
                    Toast.makeText(getApplicationContext(),"Regulamin nie został zatwierdzony",Toast.LENGTH_SHORT).show();
                }
            }
        });

        imageButtonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (acceptRuels == true) {
                    Intent intent = new Intent(MainActivity.this, Cennik.class);
                    intent.putExtra("night",nightMode);
                    startActivity(intent);
                }
                else {
                }
            }
        });


    }
}
