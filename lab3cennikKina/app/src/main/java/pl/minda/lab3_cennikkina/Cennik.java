package pl.minda.lab3_cennikkina;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Cennik extends AppCompatActivity {

    FrameLayout frameLayout;
    Spinner spinner;
    String aktualnyProdukt;
    Button buttonSprawdzCene;
    RadioGroup radioGroup;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cennik);

        frameLayout = findViewById(R.id.cennikView);
        spinner = findViewById(R.id.spinner2);
        buttonSprawdzCene = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        radioGroup = findViewById(R.id.myRadioGroup);


        Boolean night = getIntent().getExtras().getBoolean("night");
        if(night){
            frameLayout.setBackgroundColor(Color.GRAY);
            buttonSprawdzCene.setBackgroundColor(Color.DKGRAY);
        } else{
        }



        buttonSprawdzCene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aktualnyProdukt = spinner.getSelectedItem().toString();

                int id = radioGroup.getCheckedRadioButtonId();



                if (aktualnyProdukt.equals("Popcorn") && id == R.id.maly){
                    textView.setText(R.string.małyPopconr);
                }
                else if (aktualnyProdukt.equals("Popcorn") && id == R.id.duzy){
                    textView.setText(R.string.dużyPopconr);
                }
                else if (aktualnyProdukt.equals("Popcorn") && id == R.id.mega){
                    textView.setText(R.string.megaPopconr);
                }
                else if (aktualnyProdukt.equals("Napój") && id == R.id.maly){
                    textView.setText(R.string.małyNapój);
                }
                else if (aktualnyProdukt.equals("Napój") && id == R.id.duzy){
                    textView.setText(R.string.dużyNapój);
                }
                else if (aktualnyProdukt.equals("Napój") && id == R.id.mega){
                    textView.setText(R.string.megaNapój);
                }
                else if (aktualnyProdukt.equals("Nachos") && id == R.id.maly){
                    textView.setText(R.string.małeNachos);
                }
                else if (aktualnyProdukt.equals("Nachos") && id == R.id.duzy){
                    textView.setText(R.string.dużeNachos);
                }
                else if (aktualnyProdukt.equals("Nachos") && id == R.id.mega){
                    textView.setText(R.string.megaNachos);
                }
            }
        });

    }
}
