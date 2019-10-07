/**
 * @author Neil Murray-Scott
 * @version 1
 * 01/10/2019
 */

/*Stores settings for users game*/
public class Settings {

    private int boardSize;
    private int noCorvette;
    private int noFrigate;
    private int noSubmarine;
    private int noBattleship;
    private int noCarrier;

    public void setBoardSize(int boardSize){
        this.boardSize = boardSize;
    }

    public void setNoCorvette(int noCorvette){
        this.noCorvette = noCorvette;
    }

    public void setNoFrigate(int noFrigate){
        this.noFrigate = noFrigate;
    }

    public void setNoSubmarine(int noSubmarine){
        this.noSubmarine = noSubmarine;
    }

    public void setNoBattleship(int noBattleship){
        this.noBattleship = noBattleship;
    }

    public void setNoCarrier(int noCarrier){
        this.noCarrier = noCarrier;
    }

}
