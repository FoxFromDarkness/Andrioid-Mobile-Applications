package pl.minda.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thirdpage extends AppCompatActivity {

    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdpage);

        textView = findViewById(R.id.textView2);
        button = findViewById(R.id.button3);

        String reviceTextOnThirdPage = getIntent().getExtras().getString("tekstPierwszy")  + " Tekst2 :" + getIntent().getExtras().get("tekstDrugi");
        textView.setText(reviceTextOnThirdPage);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdpage.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
