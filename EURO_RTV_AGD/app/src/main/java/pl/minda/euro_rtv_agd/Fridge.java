package pl.minda.euro_rtv_agd;

public class Fridge {

    private String name;
    private int description;
    private int imageResourceId;

    public static final Fridge[] fridges = {
            new Fridge("Lodówka SAMSUNG",R.string.f_samsung_opis, R.drawable.lodowka_samsung),
            new Fridge("Lodówka PHILIPS",R.string.f_philips_opis, R.drawable.lodowka_philips),
            new Fridge("Lodówka ZELMER",R.string.f_zelmer_opis, R.drawable.lodowka_zelmer)
    };

    public Fridge(String name, int descreption, int imageResourceId) {
        this.name = name;
        this.description = descreption;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public int getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
