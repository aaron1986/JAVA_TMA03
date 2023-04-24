/**
 * Class WindTurbine simulates a type of power generator.
 *
 * @author M250 Module Team
 * @version v1
 **/
public class WindTurbine extends Generator {
    private boolean windy;

    /**
     * Constructor with a single argument to set the name field.
     * Sets the inherited field kind to "Wind Turbine".
     * Sets the windy field to false.
     * Other inherited fields are set by the superclass.
     *
     * @param name The name of the wind turbine.
     */
    public WindTurbine(String name) {
        super(name, "Wind Turbine");
                this.windy = false;
        }


    /**
     * Getter method for windy.
     *
     * @return true if windy, otherwise false.
     */
    public boolean isWindy() {
        return windy;
    }

    /**
     * Setter for windy that can also change operating status.
     *
     * @param isWindy The boolean value to set windy.
     */
    public void setWindy(boolean isWindy) {
        windy = isWindy;

        if (!windy && isOperating()) {
            flipOperating(); //flips the operation if windy is true
        }
    }

    /**
     * Overrides the flipOperating method inherited from Generator.
     * Flips the operating status only if windy is true.
     */
    @Override
    public void flipOperating() {

        if(windy || !isOperating() == false) {
            super.flipOperating();
        }
    }
}
