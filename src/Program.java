
import Exceptions.EmptyAuthorException;
import Exceptions.PossibleToLeanOnException;
import lab3.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public class Program{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        StartProgramm start = new StartProgramm(){ // Анонимный класс
            @Override
            public void start(){
                System.out.println("Код запущен");
            }
        };
        Malish malish = new Malish();
        FrekenBok frekenBok = new FrekenBok();
        Karlson karlson = new Karlson();
        Furniture closet = new Furniture("шкаф", false);
        Furniture.Doors doorsOfCloset = closet.new Doors("стекло"); // Вложенный класс non static
        Furniture chair = new Furniture("стул", true);
        Furniture window = new Furniture("окно", false);
        Book probBook1 = new Book(BookType.Задачник, "Я", 1923);
        Book probBook2 = new Book(BookType.Задачник, "", 2023);
        Book magazine = new Book(BookType.Газета, "А.С.Пушкин", 2024);
        FamilysHouse house = new FamilysHouse();
        Room malishsRoom = new Room(malish);
        Room frekenRoom = new Room(frekenBok);
        Room.RoomsDoor malishsRoomDoor = malishsRoom.new RoomsDoor("деревянная");
        house.setRooms(malishsRoom);
        house.setRooms(frekenRoom);
        doorsOfCloset.closeDoors();
        Method method = Malish.class.getDeclaredMethod("a", int.class);
        method.setAccessible(true);
        method.invoke(malish, 3);
        try{
            house.getRooms();
            FamilysHouse.Square square = new FamilysHouse.Square(); // Static вложенный класс
            System.out.println(square.getSquare());
            malish.think();
            malish.promise(karlson);
            malish.crawlTo(closet, Volume.Тихо);
            malish.sit(chair);
            malish.open(probBook1);
            malish.hear(frekenBok, closet);
            frekenBok.turn();
            malish.waitWith(Emotions.Напряжение);
            frekenBok.getup(closet);
            frekenBok.see(malish);
            frekenBok.getBack();
            try {
                frekenBok.oblackotilas(closet, doorsOfCloset);
            }
            catch (PossibleToLeanOnException e) {
                throw new RuntimeException(e);
            }
            frekenBok.stay(malish);
            frekenBok.closeEyes("опхушие");
            malish.hearClosing();
            frekenBok.closeDoor(malishsRoomDoor);
            malish.laugh();
            karlson.fly(window);
            karlson.help(frekenBok);
            frekenBok.foundOut();
            frekenBok.stillStay();
        }
        catch (EmptyAuthorException b){
            System.err.println(b.getMessage());
        }
    }
}