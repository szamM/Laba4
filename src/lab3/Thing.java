package lab3;

import java.util.Objects;
public abstract class Thing {
    private final String name;
    private final Boolean isSittable;
    public Thing(String name, Boolean isSittable){
        this.name = name;
        this.isSittable = isSittable;
    }
    public Boolean getSittable(){
        return isSittable;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof Thing other)) return false;
        return Objects.equals(this.name, other.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    @Override
    public String toString() {
        return this.name;
    }
}