package pl.minda.euro_rtv_agd;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WashingMachilneActivity extends Activity {

    public static final String EXTRA_WASHINGMACHINENO = "WashingMachilneNO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_washing_machilne);

        // Pobieramy identyfikator napoju z intencji
    int WashingMachilneNO = (Integer)getIntent().getExtras().get(EXTRA_WASHINGMACHINENO);
    WashingMachilne washingMachilne = WashingMachilne.washingMachilnes[WashingMachilneNO];

    // Wyświetlamy zdjęcie napoju
    ImageView photo = (ImageView)findViewById(R.id.imageView2);
        photo.setImageResource(washingMachilne.getImageResourceId());
        photo.setContentDescription(washingMachilne.getName());

    // Wyświetlamy nazwę napoju
    TextView name = (TextView)findViewById(R.id.name);
        name.setText(washingMachilne.getName());

    // Wyświetlamy opis napoju
    TextView description = (TextView)findViewById(R.id.description);
        description.setText(washingMachilne.getDescription());
}
}
