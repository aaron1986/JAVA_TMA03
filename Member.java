import java.util.Date;

/**
 * Write a description of class Member here.
 *
 * @author (Aaron Smith)
 * @version (24/04/2023)
 */
public class Member
{
    private int memberId;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String contactDetails;
    private Date joinDate;
    private String membershipType;
    private double membershipFees;
    private int visits;
    
    public Member(int memberId,String name, int age,String gender,String address,  String contactDetails, Date joinDate, String membershipType, double membershipFees, int visits) {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
        this.joinDate = joinDate;
        this.membershipType = membershipType;
        this.membershipFees = membershipFees;
        this.visits = visits;
    }
    
    //Getters and Setters
    public void addVisit() {
            visits++;
    }

}
