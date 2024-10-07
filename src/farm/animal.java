package farm;

public class animal {
    private boolean can_Swim;
    private boolean can_Walk;
    private String name;
    public animal (boolean can_Swim,boolean can_Walk,String name) {
        this.can_Swim = can_Swim;
        this.can_Walk = can_Walk;
        this.name = name;
    }

    public boolean isCan_Swim() {
        return can_Swim;
    }

    public void setCan_Swim(boolean can_Swim) {
        this.can_Swim = can_Swim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCan_Walk() {
        return can_Walk;
    }

    public void setCan_Walk(boolean can_Walk) {
        this.can_Walk = can_Walk;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Can Swim: " + can_Swim + ", Can Walk: " + can_Walk;
    }
}
