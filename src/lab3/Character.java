package lab3;

import java.util.Objects;
public abstract class Character {
    private final String name;
    public Character(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof Character other)) return false;
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