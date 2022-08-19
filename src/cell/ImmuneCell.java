package cell;

import java.util.ArrayList;

//This cell represents an immune cell. Its job is to fight CancerCells
public class ImmuneCell extends Cell{
    //constructor
    public ImmuneCell(int x, int y){
        super(3, x, y, 4);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors){

    }
}
