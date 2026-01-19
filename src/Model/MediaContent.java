package Model;

abstract class MediaContent {
    private int id;
    private String tittle;
    private int duration;

    public MediaContent(){}

    public MediaContent(int id, String tittle, int duration) {
        this.id = id;
        this.tittle = tittle;
        this.duration = duration;
    }

    public String displayDetails(){
        return "Id: " + this.id + ", Tittle: " + this.tittle + ", Duration: " + this.duration;
    }
}
