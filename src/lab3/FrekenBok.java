package lab3;

import Exceptions.PossibleToLeanOnException;

public class FrekenBok extends Character implements AbleToSee, AbleToStay,AbleToGetUp, GetBackable, Oblackotilable, Turnable, Checkable, AbleToCloseDoor, AbleToFoundOut, StillStayeble{
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


    public void closeEyes(String state) {
        class EyeLids{ //Локальный класс
            String eyeLidsState = state;
            String name = "веки";
        }
        EyeLids eyeLids = new EyeLids();
        System.out.println(getName() + "только несколько раз опускала " + eyeLids.eyeLidsState + " " + eyeLids.name + " , словно проверяя себя, не обман ли это зрения.");
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
    public void closeDoor(Room.RoomsDoor door){
            System.out.println(this.getName() + " закрыла " + door.material + " дверь " + door.getDoorOwner() + ".");
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
    public void oblackotilas(Furniture furn, Furniture.Doors door) throws PossibleToLeanOnException {
        if (!door.isOpen){
            System.out.println(" прислонилась к " + furn.getName());
        }
        else{
            throw new PossibleToLeanOnException(getName() + "упала в " + furn.getName() + " и пропала в нем навсегда");
        }
    }

    @Override
    public void turn() {
        System.out.print("Сейчас " + getName() + " обернется");
    }
    @Override
    public void foundOut(){
        System.out.print(getName() + " ничего не заметила. ");
    }
    @Override
    public void stillStay(){
        System.out.println(getName() + " всё ещё стояла молча и, видно, что-то обдумывала.");
    }
}
