package cell;

import java.util.ArrayList;

public class Cell {
    //instance variables
    private int strength; //The strength of the cell used for combat simulation; strength > 0
    private int x; //The x coordinate of the cell; x >= 0
    private int y; //The x coordinate of the cell; y >= 0
    private int id; //This will be used to distinguish between different cell types; id >= 0

    //default constructor
    public Cell() {
        strength = 0;
        x = 0;
        y = 0;
        id = 0;
    }

    //user constructor
    public Cell(int strength, int x, int y, int id) {
        setStrength(strength);
        setX(x);
        setY(y);
        setId(id);
    }

    //getters and setters
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if (strength > 0) {
            this.strength = strength;
        }
        else{
            this.strength = 0;
            System.out.println("error: int strength should be a positive number");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }
        else {
            this.x = 0;
            System.out.println("error: int x should be at least 0");
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }
        else {
            this.y = 0;
            System.out.println("error: int y should be at least 0");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
        else{
            this.id = 0;
            System.out.println("error: int id should be at least 0");
        }
    }

    //method
    public void interactNeighbors(ArrayList<Cell> neighbors){

    }
}
