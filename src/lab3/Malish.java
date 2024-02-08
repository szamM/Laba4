package lab3;
public class Malish extends Character implements AbleToSit, AbleToOpenBook, AbleToThink, Hearable, AbleToWait, Crawlable, Promisable{

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
    public void OpenBook() {
        System.out.println(" открыл задачник. ");
    }

    @Override
    public void sit() {
        System.out.print("сел на стул и");
    }

    @Override
    public void Wait() {
        System.out.println(" " + getName() + "ждал этого момента с огромным напряжением.");
    }

    @Override
    public void crawl() {
        System.out.print("Поэтому " + this.getName() + " тихонько подкрался к своему столу ");

    }

    @Override
    public void hear(Names name) {
        if (Names.ФрэкенБок == name) {
            System.out.print(this.getName() + " слышал, как " + name + " обшаривает шкаф.");
        }
    }
    @Override
    public void promise(Names name)  {
        if (Names.Карлсон == name){
            System.out.print("Но ведь " + this.getName() + " обещал помогать " + name + "у чем сможет. " );
        }
    }


}
