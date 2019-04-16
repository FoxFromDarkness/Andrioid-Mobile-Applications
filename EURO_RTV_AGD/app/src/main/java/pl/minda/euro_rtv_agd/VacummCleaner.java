package pl.minda.euro_rtv_agd;

public class VacummCleaner {
    private String name;
    private int description;
    private int imageResourceId;

    public static final VacummCleaner[] vacummCleaners = {
            new VacummCleaner("IROBOT SAMSUNG",R.string.vc_samsung_opis, R.drawable.irobot_samsung),
            new VacummCleaner("STANDARD VC PHILIPS",R.string.vc_philips_opis, R.drawable.svc_philips),
            new VacummCleaner("MINI VC ZELMER",R.string.vc_zelmer_opis, R.drawable.mvc_zelmer)
    };

    public VacummCleaner(String name, int descreption, int imageResourceId) {
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
