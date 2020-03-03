package ass2;

public abstract class News implements INewsInterface {
    int ID;
    String Title;
    String PublishDate;
    String Author;
    String Content;
    float AverageRate;

    @Override
    public void Display() {
        System.out.println("ID : "+getID());
        System.out.println("Title : "+getTitle());
        System.out.println("PublishDate : "+getAuthor());
        System.out.println("Author : "+getContent());
        System.out.println("Content : "+getPublishDate());
        System.out.println("AverageRate : "+getAverageRate());
    }


    public News() {
    }

    public News(int ID,String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        this.AverageRate = averageRate;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setAverageRate(float averageRate) {
        AverageRate = averageRate;
    }
}
