import java.util.ArrayList;

public class Grid {
    public int gridStore;
    public ArrayList<Generator> generators;

    public Grid() {
        gridStore = 0;
        generators = new ArrayList<Generator>();
    }
    
    /**
     * Displays the String representation of the grid
     */
    public void display()
    {
        System.out.print(this);
        System.out.println("Energy in grid store: " + gridStore);
    }
    
    public void addGenerator(Generator generator) {
        generators.add(generator);
    }

     public void generator2Grid(Generator g, int kWattHrs)      
     {
         gridStore = gridStore + g.toGrid(kWattHrs);
     }

    public void grid2Generator(Generator generator, int kWh) {
        if (gridStore >= kWh) {
            gridStore -= kWh;
            generator.fromGrid(kWh);
        } else {
            System.out.println("Only " + gridStore + " kWh available: cannot transfer " + kWh + " to generator");
        }
    }

 public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Generators currently operating are:\n");
        for (Generator g : generators) {
            //sb += name;
        }
        return sb.toString();
    }
}
