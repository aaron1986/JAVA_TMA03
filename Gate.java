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