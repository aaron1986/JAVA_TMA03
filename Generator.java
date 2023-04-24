/**
 * Abstract class Generator simulates power generators 
 * and provides methods to implement PowerPlant.
 *
 * @author M250 Module Team
 * @version v1
 */
public abstract class Generator
{        
    private String name;    // Name of the generator
    private String kind;    // Kind of the generator
    private boolean operating;  // true if the currently generating power
    private int generatorStore; // Energy stored in kWattHrs
 
    /**
     * Flips the value of operating from true to false
     * or vice versa.
     */
    public void flipOperating()
    {
        operating = !operating;
    }

    /**
     * Getter method for operating.
     * @return true if operating, otherwise false.
     */
    public boolean isOperating()
    {
        return operating;
    }

    /**
     * Produce a String representation of a Generator.
     * @return a String representation of the receiver.
     */
    public String toString()
    {
        return "name: " + name + " kind:  " + kind  + " generator store: "
                + generatorStore + " is operating: " + operating;
    }   
    
    /**
     * Pause execution for a specified number of milliseconds.
     * @param millis The number of milliseconds to pause execution by
     */
    public void pause(int millis)
    {
        try {
            Thread.sleep(millis);
        }
        catch(Exception e)  {
            System.err.println("There was a problem pausing execution");
        }
    }
}