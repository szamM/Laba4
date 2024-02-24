package lab3;

import Exceptions.EmptyAuthorException;

import javax.naming.AuthenticationException;

public class Malish extends Character implements AbleToSit, AbleToOpen, AbleToThink, Hearable, AbleToWait, Crawlable, Promisable, AbleToLaugh{

    public Malish() {
        super("Малыш");
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
    public void think() {
        System.out.print(this.getName() + " не считал, что это лучший способ позабавиться. ");
    }


    @Override
    public void open(Book book) throws EmptyAuthorException {
        if (book.getAuthor().isEmpty()){
            throw new EmptyAuthorException("\nУ книги должен быть автор");
        }
        else{
            System.out.println(" открыл " + book.getType() + ", Написанный: " + book.getAuthor() + " в " + book.getDate() + ". ");

        }
    }

    @Override
    public void sit(Furniture thing) {
        if (thing.getSittable()){
            System.out.print(" сел на " + thing.getName() + " и");
        }
        else{
            System.out.print(" не смог сесть на " + thing.getName() + " и");
        }
    }

    @Override
    public void waitWith(Emotions emotion) {
        System.out.println(" " + getName() + " ждал этого момента с " + emotion.name());
    }

    @Override
    public void crawlTo(Thing thing, Volume vol) {
        System.out.print("Поэтому " + this.getName() + " " + vol.name() + " подкрался к своему " + thing);

    }

    @Override
    public void hear(FrekenBok frekenBok, Furniture thing) {
        System.out.println(this.getName() + " слышал, как " + frekenBok.getName() + frekenBok.check(thing));

    }
    @Override
    public void hearClosing(){
        System.out.print(getName() + " услышал, что ");
    }

    @Override
    public void promise(Character person)  {
        System.out.println("Но ведь " + getName() + " обещал помогать " + person.getName() + " чем сможет.");
    }
    @Override
    public void laugh(){
        System.out.print(getName() + " рассмеялся. ");
    }

    private void a(int i) {
        System.out.println("aaaaaa" + i);

    }

}
