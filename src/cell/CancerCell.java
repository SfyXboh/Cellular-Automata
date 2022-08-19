package cell;

import java.util.ArrayList;

//A complex cell that kills its neighbors and tries to grow
public class CancerCell extends Cell{
    //constructor
    public CancerCell(int x, int y){
        super(1, x, y, 3);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors){

    }
}
