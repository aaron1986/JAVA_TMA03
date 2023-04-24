/**
 * Class WindTurbine simulates a type of power generator.
 *
 * @author M250 Module Team
 * @version v1
 **/
public class WindTurbine
{   
    private boolean windy;
 
    /**
     * Getter method for windy.
     * @return true if windy, otherwise false.
     */
    public boolean isWindy()
    {
        return windy;
    }
    
    // /**
     // * Setter for windy that can also change operating status.
     // * @param isWindy The boolean value to set windy 
     // */
    // public void setWindy(boolean isWindy)
    // {
        // windy = isWindy;
        
        // if (!windy && isOperating())
        // {
            // flipOperating();
        // }
    // }
}
