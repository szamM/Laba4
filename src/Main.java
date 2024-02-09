import lab3.*;
public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish();
        FrekenBok frekenBok = new FrekenBok();
        Thing closet = new Thing("шкаф");
        Thing chair = new Thing("стул");
        Thing book = new Thing("книгу");
        malish.think();
        malish.promise(Names.Карлсон);
        malish.crawl_to(closet);
        malish.sit(chair);
        malish.open(book);
        malish.hear(Names.ФрэкенБок);
        frekenBok.turn();
        malish.Wait();
        frekenBok.GetBack();
        frekenBok.oblackotilas();
        frekenBok.stay(Names.Малыш);
        frekenBok.CloseEyes();

    }
}