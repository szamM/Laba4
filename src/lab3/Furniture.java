package lab3;

public class Furniture extends Thing{
    public String name;
    public Furniture(String name, boolean isSittable) {
        super(name , isSittable);
        this.name = name;
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
