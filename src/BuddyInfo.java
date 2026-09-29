public class BuddyInfo {

    private String name;

    static void main() {
        // new thing
        BuddyInfo obj1 = new BuddyInfo("Liam2");

        System.out.println("Hello World! " + obj1.getName());
    }
    public BuddyInfo(String name) {
        this.name = name;
    }

    public BuddyInfo() {
        this.name = "Liam";
    }

    public String getName() {
        return name;
    }
}
