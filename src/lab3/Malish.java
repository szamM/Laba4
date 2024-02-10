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
    public void open(Book typeOfBook) {
        System.out.println(" открыл " + typeOfBook.name() + ". ");
    }

    @Override
    public void sit(Thing thing) {
        System.out.print("сел на " + thing + " и");
    }

    @Override
    public void waitt() {
        System.out.println(" " + getName() + " ждал этого момента с огромным напряжением.");
    }

    @Override
    public void crawlTo(Thing thing) {
        System.out.print("Поэтому " + this.getName() + " тихонько подкрался к своему " + thing + "у, ");

    }

    @Override
    public void hear(Names name) {
        if (Names.ФрэкенБок == name) {
            System.out.println(this.getName() + " слышал, как " + name + " обшаривает шкаф.");
        }
    }
    @Override
    public void promise(Character person)  {
        System.out.println("Но ведь " + getName() + " обещал помогать " + person.getName() + "у чем сможет.");
    }


}
