package pl.minda.euro_rtv_agd;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FridgeActivity extends Activity {

    public static final String EXTRA_FRIDGENO = "FridgesNO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fridge);

        // Pobieramy identyfikator z intencji
        int FridgesNO = (Integer)getIntent().getExtras().get(EXTRA_FRIDGENO);
        Fridge fridge = Fridge.fridges[FridgesNO];

        // Wyświetlamy zdjęcie
        ImageView photo = (ImageView)findViewById(R.id.imageView2);
        photo.setImageResource(fridge.getImageResourceId());
        photo.setContentDescription(fridge.getName());

        // Wyświetlamy nazwę
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(fridge.getName());

        // Wyświetlamy opis
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(fridge.getDescription());
    }
}
