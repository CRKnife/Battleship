/**
 * @author Neil Murray-Scott
 * @version 1
 * 07/10/2019
 */

public class Ship {
    
    String shipClass;
    int shipSize;
    int shipPosition;

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public void setShipSize(int shipSize) {
        this.shipSize = shipSize;
    }

    public void setShipPosition(int shipPosition) {
        this.shipPosition = shipPosition;
    }

    public String getShipClass() {
        return shipClass;
    }

    public int getShipSize() {
        return shipSize;
    }

    public int getShipPosition() {
        return shipPosition;
    }
}
