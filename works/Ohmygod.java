package works;
/**
 * Created by admin on 2015/10/29.
 */
import java.util.Scanner;
public class Ohmygod {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("which club is:");
        String clubName = scanner.nextLine();
        System.out.println("whose club:");
        String owner = scanner.nextLine();
        System.out.println("number of player");
        ClubMembers clubMembers = new ClubMembers();
        ClubMembers.OhmyGod1 omg = clubMembers.new OhmyGod1();
        int j = scanner.nextInt();
        for (int i = 0; i <= j - 1; i++) {
            System.out.println("player's name:");
            String playerName = scanner.next();
            boolean will = scanner.nextBoolean();
            clubMembers.joinClub(playerName, will);
        }
        int z = scanner.nextInt();
        clubMembers.retire(z);
        omg.getName(clubName, owner);
    }

}
