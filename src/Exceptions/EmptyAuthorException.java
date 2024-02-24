package Exceptions;

public class EmptyAuthorException extends RuntimeException{
    private String author;
    public EmptyAuthorException(String message, Throwable cause, String author){
        super(message, cause);
        this.author = author;
    }
    public EmptyAuthorException(String message){
        super(message);
    }
}
