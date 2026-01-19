package Model;

public class MediaContent {
    private int id;
    private String tittle;
    private int duration;

    public MediaContent(){}

    public MediaContent(int id, String tittle, int duration) {
        this.id = id;
        this.tittle = tittle;
        this.duration = duration;
    }

    //Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String displayDetails(){
        return "Id: " + this.id + ", Tittle: " + this.tittle + ", Duration: " + this.duration;
    }
}
