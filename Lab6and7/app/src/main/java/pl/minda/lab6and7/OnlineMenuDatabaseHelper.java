package pl.minda.lab6and7;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class OnlineMenuDatabaseHelper extends SQLiteOpenHelper {

    private static String DB_NAME = "Car_DB";
    private static int DB_VERSION = 1;

    public OnlineMenuDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        //Orders
        db.execSQL(createTableOrder("AORDER"));

        ContentValues newItem = new ContentValues();
        newItem.put("NAME", "Test");
        newItem.put("AMOUNT", "100");
        db.insert("AORDER", null, newItem);


        //Create Table
        db.execSQL(createTable("SPORT"));
        db.execSQL(createTable("SUV"));
        db.execSQL(createTable("PREMIUM"));

        //Insert Items
        db.insert("SPORT", null,
                createItem("Honda Civic",
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae aliquam enim.",
                        200000, R.drawable.honda_civic));
        db.insert("SPORT", null,
                createItem("Porshe Panamera",
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae aliquam enim.",
                        300000, R.drawable.porshe_panamera));
        db.insert("SPORT", null,
                createItem("Lamborghini Urus",
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae aliquam enim.",
                        400000, R.drawable.lambo_ursus));


        db.insert("PREMIUM", null,
                createItem("Lexus",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae aliquam enim.",
                        900000, R.drawable.lexus));
        db.insert("PREMIUM", null,
                createItem("Tesla",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae aliquam enim.",
                        1200000, R.drawable.tesla));


        db.insert("SUV", null,
                createItem("Land Rover",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae aliquam enim.",
                        400000, R.drawable.landrover));
        db.insert("SUV", null,
                createItem("Dacia Duster",
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam vitae aliquam enim.",
                        400000, R.drawable.dacia));

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    private String createTable(String nameTable) {
        return "CREATE TABLE " + nameTable + " (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "DESCRIPTION TEXT, "
                + "PRICE REAL, "
                + "IMAGE_RESOURCE_ID INTEGER);";
    }

    private String createTableOrder(String nameTable) {
        return "CREATE TABLE " + nameTable + " (" +
                "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "AMOUNT TEXT);";
    }

    private ContentValues createItem(String name, String description, float price, int imageResId) {
        ContentValues newItem = new ContentValues();

        newItem.put("NAME", name);
        newItem.put("DESCRIPTION", description);
        newItem.put("PRICE", price);
        newItem.put("IMAGE_RESOURCE_ID", imageResId);

        return newItem;
    }

}
