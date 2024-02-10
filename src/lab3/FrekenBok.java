package lab3;

public class FrekenBok extends Character implements AbleToCloseEyes, AbleToSee, AbleToStay,AbleToGetUp, GetBackable, Oblackotilable, Turnable{
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
    public void getup() {
        System.out.println(getName() + " тут же вынырнула из недр шкафа");
    }

    @Override
    public void see(Names name) {
        System.out.println(" первое что увидела " + getName() + ", был" + name);
    }

    @Override
    public void stay(Names name) {
        System.out.println("Так " + getName() + " простояла довольно долго, не говоря ни слова и не совдя с " + name + "а глаз.");
    }

    @Override
    public void getBack() {
        System.out.print(getName() + " попятилась назад и");
    }

    @Override
    public void oblackotilas() {
        System.out.println(" прислонилась к дверям шкафа.");
    }

    @Override
    public void turn() {
        System.out.print("Сейчас " + this.getName() + " обернеться");
    }
}
