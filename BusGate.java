import java.util.Objects;

/** 
 * @author M250 Module Team
 * @version v2
 */
  public class BusGate extends Gate 
{
    
 /** QUESTION B (i)
 */
    private boolean liftAvailable;
    public static final int BUS_CAPACITY = 78;
    
    
     /** QUESTION B (ii)
 */
  public BusGate(int gateNum, boolean arrival, String fltNum, boolean liftAvailable) {
        super(gateNum, arrival, fltNum);
        this.liftAvailable = liftAvailable;
    }  
    //********************Provided code*******************
    /**
     * Find the number of bus journeys required to transport
     * passengers to or from a plane.
     * @param paxNum The number of passengers
     * @return The whole number of bus journeys that will be
     * needed to transport the number of pasengers.
     */  
     public static int busJourneys(int paxNum)
     {
     return intCeil(paxNum, BusGate.BUS_CAPACITY);
    }    

     private static int intCeil(int a, int b)
     {
     return (a + b - 1) / b;
     }
    
      /** QUESTION B (IV)
     * Return a String representation of a BusGate, including
     * its class name and gate number, flight number, and lift availability.
     * @return the string representation of the BusGate 
     */
    @Override
    public String toString() {
        String outputString = super.toString();
        if (liftAvailable) {
            outputString += "\n A lift is available";
        } else {
            outputString += "\n A lift is not available";
        }
        return outputString;
    }

/** QUESTION B (V)
 * Returns true if the gate number, flight number and lift availability of
 * the argument are the same as this object's, and false otherwise. For the
 * purpose of this method, objects of a subclass of BusGate are not considered
 * equal.
 *
 * @param obj The object to compare this BusGate with
 * @return true if the gates are equal, false otherwise
 */
@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (!(obj instanceof BusGate)) {
        return false;
    }
    BusGate other = (BusGate) obj;
    return super.equals(obj) && this.liftAvailable == other.liftAvailable;
}
    // constructor and other methods omitted for brevity
    /** QUESTION B (VI)
 * Override the inherited hashCode method so that it returns a hash code using
 * the Objects.hash method, to which you should pass the gate number, flight
 * number and lift availability in that order.
 *
 * @return the hash code of this object
 */
@Override
public int hashCode() {
    return Objects.hash(getGateNum(), getFltNum(), liftAvailable);
}


}
