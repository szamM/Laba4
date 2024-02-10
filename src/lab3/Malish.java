package lab3;
public class Malish extends Character implements AbleToSit, AbleToOpen, AbleToThink, Hearable, AbleToWait, Crawlable, Promisable{

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
    public void open(Book book) {
        System.out.println(" открыл " + book.type + ", Написанный: " + book.author + " в " + book.date + ". ");
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
    public void waitt(Emotions emotion) {
        System.out.println(" " + getName() + " ждал этого момента с " + emotion.name());
    }

    @Override
    public void crawlTo(Thing thing) {
        System.out.print("Поэтому " + this.getName() + " тихонько подкрался к своему " + thing);

    }

    @Override
    public void hear(FrekenBok frekenBok, Thing thing) {
        System.out.println(this.getName() + " слышал, как " + frekenBok.getName() + " обшаривает " + thing.getName());

    }
    @Override
    public void promise(Character person)  {
        System.out.println("Но ведь " + getName() + " обещал помогать " + person.getName() + " чем сможет.");
    }


}
