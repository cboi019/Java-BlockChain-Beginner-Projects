import java.util.ArrayList;

public class CboiCodes {
    public static void main(String[] args) throws Exception {
        // Country: Wessex
        // Candidates: Mr Obi Micheal & Mr David Okoro

        ArrayList<access> block = new ArrayList<>();

        //BLOCK 1
        String[][] Citizen1 = new String[1][3];
        Citizen1[0][0] = "Chinedu Okafor";
        Citizen1[0][1] = "Veridia State";
        Citizen1[0][2] = "Lumora LGA";
        access C1 = new access("1755290314775", Citizen1, "0");
        block.add(C1);

        String[][] Citizen2 = new String[1][3];
        Citizen2[0][0] = "Chinedu Okeke";
        Citizen2[0][1] = "Veridia State";
        Citizen2[0][2] = "Lumora LGA";
        access C2 = new access("1755290314775", Citizen2, C1.getHashValue());
        block.add(C2);


        System.out.println("**********FULL BLOCK**********");
        for (int i = 0; i < block.size() ; i++) {
            System.out.println("BLOCK " + (i + 1));
            System.out.println(block.get(i));
            System.out.println("******************************");
        }
        String combinedHash = access.combineallHash(block);
        System.out.println("\nCombined Hash: " + combinedHash);
        System.out.println("\n******************************");

        System.out.println("TAMPER CHECK.....");
        block.get(0).setData(Citizen1);
        Citizen1[0][0] = " ";
        Citizen1[0][1] = " ";
        Citizen1[0][2] = " ";
        boolean valid = access.isChainValid(block);
        System.out.println("Is Chain Valid?: " + valid);
    }
}
