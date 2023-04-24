import java.util.*;

/**
 * Class Grid simulates an electricity grid connected
 * to power generators of various types.
 *
 * @author M250 Module Team
 * @version v1
 */
public class Grid {
    //energy stored by Grid in kWh
    private int gridStore;
    //Question d(i)
    public ArrayList<Generator> generators;

    /**
     * Constructor for objects of class Grid.
     */
    public Grid() {
        gridStore = 0;
        
        //Question d(i)
        generators = new ArrayList<>();
    }

    /**
     * Displays the String representation of the grid
     */
    public void display() {
        System.out.print(this);
        System.out.println("Energy in grid store: " + gridStore);
    }

// /**
// * @param aGenerator The generator to be added to the list of generators
// */
public void addGenerator(Generator aGenerator)
 {
 generators.add(aGenerator);
 }

    // /**
// * Attempts to increases the gridStore
// * and reduces the store of the generator by the
// * same amount up to the amount available
// *
// * @param g The generator to receive energy from
// * @param kWattHrs The amount of energy to receive if available
// */
    public void generator2Grid(Generator g, int kWattHrs) {
        gridStore = gridStore + g.toGrid(kWattHrs);
    }

    //Question d(ii)
    public void grid2Generator(Generator g, int kWattHrs) {
        if(gridStore >= kWattHrs) {
            gridStore -= kWattHrs;
            g.fromGrid(kWattHrs);
        } else {
            System.out.println("Only " + gridStore + " kWh available: cannot transfer " + kWattHrs + " to generator ");
        }
    }

    //Question d(iii)
    @Override
    public String toString() {
       String result = "Generators currently operating are:\n";
       for(Generator g : generators) {
           if(g.isOperating()) {
              result += g.toString() + "\n";
           }
       }
       return result;
    }

}