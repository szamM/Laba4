package lab3;

import java.util.ArrayList;

public class FamilysHouse{
    private ArrayList<Room> rooms = new ArrayList<Room>();
    private static int square = 300;
    public static class Square{
        public static int getSquare(){
            return square;
        }
    }
    public void setRooms(Room room){
        rooms.add(room);
    }
    public void getRooms(){
        System.out.println(rooms);
    }
}
