package lab3;

public class Karlson extends Character implements Flyeble, AbleToHelp{
    public Karlson() {

        super("Карлсон");
    }
    @Override
    public boolean equals(Object otherObject) {
        return super.equals(otherObject);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 100;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public void fly(Furniture furn){
        System.out.print(getName() + " влетел через " + furn.getName() + ",");
    }
    @Override
    public void help(Character character){
        System.out.println(" чтобы помочь " + character.getName() + " понять что значит сидеть взаперти.");
    }
}

