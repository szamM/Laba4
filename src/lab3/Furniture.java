package lab3;

public class Furniture extends Thing{
    public String name;
    public Furniture(String name, boolean isSittable) {
        super(name , isSittable);
        this.name = name;
    }
    public class Doors{
        public String material;

        public Boolean isOpen; // true-Открыты, false-Закрыты
        public Doors(String material){
            this.material = material;
        }
        public void openDoors(){
            System.out.println(" двери открыты ");
            this.isOpen = true;
        }
        public void closeDoors(){
            System.out.println(" двери закрыты ");
            this.isOpen = false;
        }
    }
    public String getStringName(){
        return this.name;
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
}
