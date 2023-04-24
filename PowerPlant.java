import java.util.*;

/**
 * Write a description of interface PowerPlant here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
/**
 * PowerPlant interface representing a power generating unit
 */
public interface PowerPlant {

    /**
     * Flips the value of operating from true to false or vice versa.
     */
    void flipOperating();

    /**
     * Attempts to transfer energy from the power plant to the grid
     * and reduces the stored energy in the power plant by the
     * same amount up to the amount available
     * 
     * @param kWh The amount of energy to transfer in kilowatt hours
     * @return The amount of energy successfully transferred in kilowatt hours
     */
    int toGrid(int kWh);

    /**
     * Attempts to receive energy from the grid to the power plant
     * and increases the stored energy in the power plant by the
     * same amount up to the amount available
     * 
     * @param kWh The amount of energy to receive in kilowatt hours
     */
    void fromGrid(int kWh);
}


