package pl.minda.euro_rtv_agd;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VacummCleanerActivity extends Activity {

    public static final String EXTRA_VACUMMCLEANERNO = "vacummCleanersNO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vacumm_cleaner);

        // Pobieramy identyfikator z intencji
        int vacummCleanersNO = (Integer)getIntent().getExtras().get(EXTRA_VACUMMCLEANERNO);
        VacummCleaner vacummCleaner = VacummCleaner.vacummCleaners[vacummCleanersNO];

        // Wyświetlamy zdjęcie
        ImageView photo = (ImageView)findViewById(R.id.imageView2);
        photo.setImageResource(vacummCleaner.getImageResourceId());
        photo.setContentDescription(vacummCleaner.getName());

        // Wyświetlamy nazwę
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(vacummCleaner.getName());

        // Wyświetlamy opis
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(vacummCleaner.getDescription());
    }
}
