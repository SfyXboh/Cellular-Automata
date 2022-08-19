package cell;

import java.util.ArrayList;

//This cell represents a tissue cell. It grows by replacing neighbouring DeadCells with TissueCells
public class TissueCell extends Cell{
    //constructor
    public TissueCell(int x, int y){
        super(0, x, y, 1);
    }

    @Override
    public void interactNeighbors(ArrayList<Cell> neighbors){

    }
}
