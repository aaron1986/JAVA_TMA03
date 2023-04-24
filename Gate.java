import java.util.Objects;

/** 
 * A Gate in an airport has a number and is for an arrival or departure. 
 * It is used for a particular flight number and it may be open or 
 * closed for passengers.
 * @author M250 Module Team 
 * @version v1
 */
public class Gate
{
    private int gateNum;      // the gate number
    private boolean arrival;  // true for arrival, false for departure 
    private String fltNum;    // the flight number of the plane using the gate
    private boolean open;     // true if the gate is open
    
    
      /** QUESTION a (i)
     * Constructs a Gate with the given parameters.
     * @param gateNum The gate number
     * @param isArrival The arrival/departure status of the gate
     * @param fltNum The flight number for the gate
     */
    public Gate(int gateNum, boolean isArrival, String fltNum) {
        this.gateNum = gateNum;
        this.arrival = isArrival;
        this.fltNum = fltNum;
        this.open = false;
    }
    
    /** QUESTION a (ii)
 * Override the Object class equals method for Gate.
 * @param o the object to compare for equality
 * @return true if the gate number and flight number of the argument are
 * the same as this object's, false otherwise
 */
@Override
public boolean equals(Object o) {
    if (o == this) {
        return true;
    }
    if (!(o instanceof Gate)) {
        return false;
    }
    Gate gate = (Gate) o;
    return gateNum == gate.gateNum &&
           Objects.equals(fltNum, gate.fltNum) &&
           getClass() == o.getClass();
}


/** QUESTION a (iii)
 * Returns a hash code for this Gate.
 * @return a hash code value for this object.
 */
@Override
public int hashCode() {
    return Objects.hash(gateNum, fltNum);
}

    /**
     * Getter for the gate number.
     * @return The number of the gate
     */
    public int getGateNum()
    {
        return gateNum;
    }

    /**
     * Setter for the gate number.
     * @param aGateNum the gate's number
     */
    public void setGateNum(int aGateNum)
    {
        gateNum = aGateNum;
    }

    /**
     * Getter for the gate arrival status - true if for arrival.
     * @return the arrival / departure status of the gate
     */
    public boolean isArrival()
    {
        return arrival;
    }

    /**
     * Setter for whether gate is for an arrival or for a departure.
     * @param isArrival The arrival/ departure status of the gate
     */
    public void setArrival(boolean isArrival)
    {
        arrival = isArrival;
    }

    /**
     * Getter for the gate's flight number.
     * @return The flight number of the gate
     */
    public String getFltNum()
    {
        return fltNum;
    }

    /**
     * Setter for the gate's flight number.
     * @param aFltNum The flight number for the gate
     */
    public void setFltNum(String aFltNum)
    {
        fltNum = aFltNum;
    }  

    /**
     * Getter for the gate status - open or closed.
     * @return status of the gate
     */
    public boolean isOpen()
    {
        return open;
    }

    /**
     * Setter for open.
     * @param isOpen The gate's open/ closed status
     */
    public void setOpen(boolean isOpen)
    {
        open = isOpen;
    }

    /**
     * Return a String representation of a Gate including
     * its class name, allowing for extension by subclasses.
     * @return the string representation of the gate 
     */
    @Override
    public String toString()
    {
        String outputString = String.format("%s number %d for flight %s",
                getClass().getSimpleName(), gateNum, fltNum);

        if (open) {
            outputString += " is open.";
        }
        else {
            outputString += " is closed.";
        }

        return outputString;
    }      
    
    
}