package lab3;

public class Thing extends Character{
    private final String name;
    public Thing(String name){
        super(name);
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
