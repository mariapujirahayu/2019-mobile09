package id.ac.polinema.recyclerviewsangatsederhana.models;

public class SuperHero {
    private String heroName;
    private int gambar;

    public SuperHero(String heroName, int gambar) {
        this.heroName = heroName;
        this.gambar = gambar;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}