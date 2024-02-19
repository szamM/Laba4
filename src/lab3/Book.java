package lab3;

public class Book{
    private final BookType type;
    private final String author;
    private final Integer date;
    public Book(BookType type, String author, Integer date){
        this.type = type;
        this.author = author;
        this.date = date;

    }
    public BookType getType(){
        return this.type;
    }
    public Integer getDate(){
        return this.date;
    }
    public String getAuthor(){
        return this.author;
    }
}
