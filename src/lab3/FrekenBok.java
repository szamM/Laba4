package lab3;

public class FrekenBok extends Character implements AbleToCloseEyes, AbleToSee, AbleToStay,AbleToGetUp, GetBackable, Oblackotilable, Turnable, Checkable{
    public FrekenBok() {

        super("ФрэкенБок");
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
    public void closeEyes() {
        System.out.println(getName() + "только несколько раз опускала веки, словно проверяя себя, не обман ли это зрения.");
    }
    @Override
    public String check(Furniture furn) {
        return " обшаривает " + furn.getStringName();
    }
    @Override
    public void getup(Furniture furn) {
        System.out.print(getName() + " тут же вынырнула из " + furn.getName());
    }

    @Override
    public void see(Malish malish) {
        System.out.println(" первое что увидела " + getName() + ", был " + malish.getName());
    }

    @Override
    public void stay(Malish malish) {
        System.out.println("Так " + getName() + " простояла довольно долго, не говоря ни слова и не совдя с " + malish.getName() + "а глаз.");
    }

    @Override
    public void getBack() {
        System.out.print(getName() + " попятилась назад и");
    }

    @Override
    public void oblackotilas(Furniture furn) {
        System.out.println(" прислонилась к " + furn.getName());
    }

    @Override
    public void turn() {
        System.out.print("Сейчас " + getName() + " обернется");
    }
}
