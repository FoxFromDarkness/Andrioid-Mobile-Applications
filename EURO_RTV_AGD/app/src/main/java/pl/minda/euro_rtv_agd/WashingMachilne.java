package pl.minda.euro_rtv_agd;

public class WashingMachilne {

    private String name;
    private int description;
    private int imageResourceId;

    public static final WashingMachilne[] washingMachilnes = {
            new WashingMachilne("Pralka SAMSUNG",R.string.wm_samsung_opis, R.drawable.wm_samsung),
            new WashingMachilne("Pralka PHILIPS",R.string.wm_philips_opis, R.drawable.wm_philips),
            new WashingMachilne("Pralka ZELMER",R.string.wm_zelmer_opis, R.drawable.wm_zelmer)
    };

    public WashingMachilne(String name, int descreption, int imageResourceId) {
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
