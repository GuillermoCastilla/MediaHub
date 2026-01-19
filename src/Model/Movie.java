package Model;

public class Movie extends MediaContent implements Downloadable,Playable {
    private String resolution;

    public Movie(int id, String tittle, int duration, String resolution) {
        super(id, tittle, duration);
        this.resolution = resolution;
    }

    //Getter & Setter
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    public String getResolution() {
        return resolution;
    }

    //Override Interfaces
    @Override
    public void download() {}

    @Override
    public void play() {}

}
