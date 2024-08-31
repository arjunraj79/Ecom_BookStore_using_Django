import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Define a Group class to hold members of each group
class Group {
    private List<String> members;
    private int groupId;

    public Group(int groupId) {
        this.groupId = groupId;
        this.members = new ArrayList<>();
    }

    public void addMember(String member) {
        members.add(member);
    }

    public void displayGroup() {
        System.out.println("Group " + groupId + ":");
        for (String member : members) {
            System.out.println(member);
        }
        System.out.println();
    }
}

public class RandomGroupGenerator {
    public static void main(String[] args) {
        // Array of students
        String[] members = {
            "4mk21cs001", "4mk21cs002", "4mk21cs003", "4mk21cs004", "4mk21cs005", "4mk21cs006", "4mk21cs007", "4mk21cs008",
            "4mk21cs009", "4mk21cs010", "4mk21cs011", "4mk21cs012", "4mk21cs013", "4mk21cs014", "4mk21cs015", "4mk21cs016",
            "4mk21cs017", "4mk21cs018", "4mk21cs019", "4mk21cs020", "4mk21cs021", "4mk21cs022", "4mk21cs023", "4mk21cs024",
            "4mk21cs025", "4mk21cs026", "4mk21cs027", "4mk21cs028", "4mk21cs029", "4mk21cs030", "4mk21cs031", "4mk21cs032",
            "4mk21cs033", "4mk21cs034", "4mk21cs035", "4mk21cs036", "4mk21cs037", "4mk21cs038", "4mk21cs039", "4mk21cs040",
            "4mk21cs041", "4mk21cs042", "4mk21cs043", "4mk21cs044", "4mk21cs045", "4mk21cs046", "4mk21cs047", "4mk21cs048",
            "4mk21cs049", "4mk21cs050", "4mk21cs051", "4mk21cs052", "4mk21cs053", "4mk21cs054", "4mk21cs055", "4mk21cs056",
            "4mk21cs057", "4mk21cs058", "4mk21cs059", "4mk21cs060", "4mk21cs061", "4mk21cs062", "4mk21cs063", "4mk21cs064",
            "4mk21cs065", "4mk21cs066", "4mk21cs067", "4mk21cs068", "4mk21cs069", "4mk21cs070", "4mk21cs071", "4mk21cs072",
            "4mk21cs073", "4mk21cs074", "4mk21cs075", "4mk21cs076", "4mk21cs077", "4mk21cs078", "4mk21cs079", "4mk21cs080",
            "4mk21cs081", "4mk21cs082", "4mk21cs083"
        };

        // Convert the array to an ArrayList for easier shuffling
        List<String> memberList = new ArrayList<>();
        Collections.addAll(memberList, members);

        // Shuffle the list to randomize the order of members
        Collections.shuffle(memberList);

        // Number of groups
        int groupSize = 8;
        int numberOfGroups = memberList.size() / groupSize;

        // Create groups
        List<Group> groups = new ArrayList<>();
        for (int i = 0; i < numberOfGroups; i++) {
            Group group = new Group(i + 1);
            for (int j = 0; j < groupSize; j++) {
                group.addMember(memberList.get(i * groupSize + j));
            }
            groups.add(group);
        }

        // Display groups
        for (Group group : groups) {
            group.displayGroup();
        }

        // Handle remaining members if any
        int remainingMembers = memberList.size() % groupSize;
        if (remainingMembers > 0) {
            System.out.println("Remaining members:");
            for (int i = numberOfGroups * groupSize; i < memberList.size(); i