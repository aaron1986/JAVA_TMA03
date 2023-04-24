/**
 * Abstract class Generator simulates power generators 
 * and provides methods to implement PowerPlant.
 *
 * @author M250 Module Team
 * @version v1
 */

public abstract class Generator implements PowerPlant
{        
    private String name;    // Name of the generator
    private String kind;    // Kind of the generator
    private boolean operating;  // true if the currently generating power
    private int generatorStore; // Energy stored in kWattHrs
 
/** QUESTION B(i)
 * Constructor for objects of class Generator.
 * @param name The name of the generator.
 * @param kind The kind of the generator.
 */
public Generator(String name, String kind) {
    this.name = name;
    this.kind = kind;
    this.operating = false;
    this.generatorStore = 0;
}
    
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
    
/** QUESTION B(ii)
 * Simulates the generation of electricity. If the generator is operating,
 * the method executes a loop numTimes and on each iteration increases generatorStore by numKWh.
 * The method then returns true or false depending on whether the generator is operating or not.
 * 
 * @param numTimes The number of times to generate electricity
 * @param numKWh The amount of energy to generate on each iteration
 * @return true if the generator is operating, false otherwise
 */
public boolean generate(int numTimes, int numKWh) {
    if (!operating) {
        return false;
    }
    for (int i = 0; i < numTimes; i++) {
        generatorStore += numKWh;
        pause(100);
    }
    return true;
}


/** QUESTION B(iii)
 */
public int toGrid(int requestedEnergy) {
    int availableEnergy = Math.min(requestedEnergy, generatorStore);
    generatorStore -= availableEnergy;
    return availableEnergy;
}

/** QUESTION B(iv)
 * Increase the amount of energy stored in the generator by the given amount.
 *
 * @param amount The amount of energy to add to the generator.
 */
public void fromGrid(int amount) {
    generatorStore += amount;
}




}