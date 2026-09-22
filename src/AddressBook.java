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
        BuddyInfo person1 = new BuddyInfo("steve");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(person1);
        addressBook.removeBuddy(person1);

        System.out.println("Address Book");


    }

}
