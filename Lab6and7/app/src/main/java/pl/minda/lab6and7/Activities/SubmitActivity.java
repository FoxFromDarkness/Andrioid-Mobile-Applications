package pl.minda.lab6and7.Activities;

import android.app.ActionBar;
import android.content.ContentValues;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import pl.minda.lab6and7.AsyncTask.MyAsyncTask;
import pl.minda.lab6and7.R;


public class SubmitActivity extends ToolbarCreator {

    private TextView textViewName;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        setIdMenu(R.menu.main_menu);
        setThisActivity(SubmitActivity.this);

        textViewName = findViewById(R.id.textView_Submit);
        editText = findViewById(R.id.editText);

        textViewName.setText(getFoodName());
    }

    public void sendResult(View view) {

//        try {
//             double start = System.currentTimeMillis();
//
//            SQLiteOpenHelper databaseHelper = new OnlineMenuDatabaseHelper(this);
//            SQLiteDatabase db = databaseHelper.getReadableDatabase();
//
//            db.insert("AORDER", null, createItem(getFoodName(), editText.getText().toString()));
//
//            double end = System.currentTimeMillis() - start;
//            Log.e("TIME", "Submit:sendResult: " + end+"msek"); //14msek
//
//        } catch (SQLiteException e) {
//            Toast toast = Toast.makeText(this, "Baza danych jest niedostępna", Toast.LENGTH_SHORT);
//            toast.show();
//        }

        new MyAsyncTask(getFoodName(), editText.getText().toString(), this).execute();
    }

    private ContentValues createItem(String name, String amount) {

        ContentValues newItem = new ContentValues();

        newItem.put("NAME", name);
        newItem.put("AMOUNT", amount);

        return newItem;
    }

}
