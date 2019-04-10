package pl.minda.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondpage extends AppCompatActivity {

    TextView textViewClass;
    EditText editText2;
    Button button2;
    String tekst2;
    String tekstViewTekst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        textViewClass = findViewById(R.id.textView);
        editText2 = findViewById(R.id.editText2);

        String reciveTekstClass = "Tekst1: " + getIntent().getExtras().getString("reciveTekst");
        textViewClass.setText(reciveTekstClass);

        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst2 = editText2.getText().toString();
                tekstViewTekst = textViewClass.getText().toString();
                Intent intent2 = new Intent(secondpage.this, thirdpage.class);
                intent2.putExtra("tekstPierwszy",tekstViewTekst);
                intent2.putExtra("tekstDrugi",tekst2);
                startActivity(intent2);
            }
        });

    }
}
