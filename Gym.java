import java.util.ArrayList;
/**
 * Write a description of class Gym here.
 *
 * @author (Aaron Smith)
 * @version (24/04/2023)
 */
public class Gym
{

    private ArrayList<Member>members;
    private int dailyVisitors;
    private int monthlyVisitors;
    
   public Gym() {
       members = new ArrayList<>();
       dailyVisitors = 0;
       monthlyVisitors = 0;
   }
   
   //Getters and Setters
   public void addMember(Member member) {
       members.add(member);
   }
   
   public void removeMember(Member member) {
       members.remove(member);
   }
   
   public ArrayList<Member>getMembers() {
       return members;
   }

}
