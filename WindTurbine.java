/**
 * Class WindTurbine simulates a type of power generator.
 *
 * @author M250 Module Team
 * @version v1
 **/
public class WindTurbine extends Generator
{   
    private boolean windy;
 
    
    /** QUESTION C(i)
     * Public single-argument constructor.
     * Sets the name inherited field using the supplied argument and sets the
     * kind inherited field to "Wind Turbine". The windy field is set to false.
     * @param name The name of the Wind Turbine.
     */
    public WindTurbine(String name) {
        super(name, "Wind Turbine");
        this.windy = false;
    }
    
    
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
     public void setWindy(boolean isWindy)
     {
         windy = isWindy;
        
         if (!windy && isOperating())
         {
             flipOperating();
         }
     }
     
     

}

