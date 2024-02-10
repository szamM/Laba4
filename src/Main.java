import lab3.*;
public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish();
        FrekenBok frekenBok = new FrekenBok();
        Karlson karlson = new Karlson();
        Thing closet = new Thing("шкаф");
        Thing chair = new Thing("стул");
        malish.think();
        malish.promise(karlson);
        malish.crawlTo(closet);
        malish.sit(chair);
        malish.open(Book.Задачник);
        malish.hear(Names.ФрэкенБок);
        frekenBok.turn();
        malish.waitt();
        frekenBok.getBack();
        frekenBok.oblackotilas();
        frekenBok.stay(Names.Малыш);
        frekenBok.closeEyes();
    }
}