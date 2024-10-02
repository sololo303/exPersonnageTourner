package tournerPersonnage;



public class tournerPersonnage {
    public enum Orientation{
        NORD,
        SUD,
        OUEST,
        EST;
    }

    private Orientation orientation;
    public tournerPersonnage() {
        this.orientation = Orientation.NORD;
    }
    public tournerPersonnage(Orientation orientation) {
        this.orientation = orientation;
    }
    static public Orientation tourner(int nbFois){
        return Orientation.NORD;
    }
}
