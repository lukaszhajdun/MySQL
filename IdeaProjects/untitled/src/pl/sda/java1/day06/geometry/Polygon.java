package pl.sda.java1.day06.geometry;

public abstract class Polygon extends Figure {
    private int numOfVerts;

    public Polygon(int numOfVerts) {
        super();
        this.numOfVerts = numOfVerts;
    }

    public int getNumOfVerts() {
        return numOfVerts;
    }

}
