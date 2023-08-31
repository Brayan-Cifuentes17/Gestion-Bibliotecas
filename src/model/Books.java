package model;

public class Books {

        private String tittle;
        private String author;
    public Books(String tittle, String author){

        this.tittle=tittle;
        this.author=author;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "\nTITULO: " + tittle +
                "\nAUTOR: " + author+
                "\n__________";
    }
}
