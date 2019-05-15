package pl.minda.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    String tekst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tekst = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this,secondpage.class);
                intent.putExtra("reciveTekst",tekst);
                startActivity(intent);
            }
        });

    }


}
