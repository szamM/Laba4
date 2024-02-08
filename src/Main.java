import lab3.*;
public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish();
        FrekenBok frekenBok = new FrekenBok();
        malish.think();
        malish.promise(Names.Карлсон);
        malish.crawl();
        malish.sit();
        malish.OpenBook();
        malish.hear(Names.ФрэкенБок);
        frekenBok.turn();
        malish.Wait();
        frekenBok.GetBack();
        frekenBok.oblackotilas();
        frekenBok.stay(Names.Малыш);
        frekenBok.CloseEyes();

    }
}