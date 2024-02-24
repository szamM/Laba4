package lab3;

public class Room {
    private String owner;
    private Boolean doorStat; // true-opened, false-closed
    public Room(Character character){
        this.owner = character.getName();
    }
    public String getOwner(){
        return "комната " + this.owner;
    }
    public class RoomsDoor{
        public String material;
        public Boolean doorsState; //true-Открыты, false-Закрыты
        public RoomsDoor(String material){
            this.material = material;
        }
        public String getDoorOwner(){
            return getOwner();
        }
        public void openRoomsDoor(){
            System.out.println(" дверь открыта ");
            this.doorsState = true;
        }
        public void closeRoomsDoor(){
            System.out.println(" дверь закрыта ");
            this.doorsState = false;
        }
    }
    @Override
    public String toString(){
        return "комната " + this.owner;
    }
}
