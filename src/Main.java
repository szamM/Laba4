import lab3.*;
public class Main {
    public static void main(String[] args) {
        Malish malish = new Malish();
        FrekenBok frekenBok = new FrekenBok();
        Karlson karlson = new Karlson();
        Furniture closet = new Furniture("шкаф", false);
        Furniture chair = new Furniture("стул", true);
        Book probBook1 = new Book(BookType.Задачник, "Я", 1923);
        Book probBook2 = new Book(BookType.Задачник, "Кто-то", 2023);
        Book magazine = new Book(BookType.Газета, "Не я", 2024);
        malish.think();
        malish.promise(karlson);
        malish.crawlTo(closet);
        malish.sit(chair);
        malish.open(probBook1);
        malish.hear(frekenBok, closet);
        frekenBok.turn();
        malish.waitt(Emotions.Напряжение);
        frekenBok.getup(closet);
        frekenBok.see(malish);
        frekenBok.getBack();
        frekenBok.oblackotilas(closet);
        frekenBok.stay(malish);
        frekenBok.closeEyes();
    }
}