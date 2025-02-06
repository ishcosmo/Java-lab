// club class static(shared) amd non static(uniquw)
class Club{
    static final String clubName = "XYZ";
    String memberName;

    public Club(String mname){
        this.memberName=mname;

    }

    public void displayClubName(){
        System.out.println("Club Name: "+ clubName);
    }
    public void displayMember(){
        System.out.println("Member name: "+this.memberName);
    }

}
public class q3 {
    public static void main(String[] args) {
        Club m1 = new Club("Ishita");
        Club m2 = new Club("Prerna");
        Club m3 = new Club("Diwa");

        m1.displayMember();
        m1.displayClubName();
        m2.displayMember();
        m2.displayClubName();
        m3.displayMember();
        m3.displayClubName();
    }
}
