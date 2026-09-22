import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<BuddyInfo> infoList;

    public AddressBook(){
        this.infoList = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo name){
        infoList.add(name);
    }
    public void removeBuddy(BuddyInfo name){
        infoList.remove(name);

    }

    public static void main(){

        System.out.println("Address Book");


    }

}
