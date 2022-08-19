package cell;

//This simple cell does nothing, and is only there to be interacted with by other cell types.
public class DeadCell extends Cell{
    //constructor
    public DeadCell(int x, int y){
        super(0, x, y, 0);
    }
}
