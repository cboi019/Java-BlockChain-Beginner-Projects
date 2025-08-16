import java.util.ArrayList;

public class CboiCodes {
    public static void main(String[] args) throws Exception {
        // Country: Wessex
        // Candidates: Mr Obi Micheal & Mr David Okoro

        ArrayList<access> block = new ArrayList<>();

        //BLOCK 1
        String[] Citizen1 = new String[6];
        Citizen1[0] = "Chinedu Okafor";
        Citizen1[1] = "Veridia State";
        Citizen1[2] = "Lumora LGA";
        Citizen1[3] = "Male";
        Citizen1[4] = "Age 23";
        Citizen1[5] = "Voted Candidate: Mr. Obi Micheal";

        access C1 = new access("1755290314775", Citizen1, "0");
        block.add(C1);
        // HashValue: 4a76b319b949320572607499f0f355a796f2b8b0229642811c7314b8a0aca09c
        // Date and Time Created: Fri Aug 15 21:38:34 WAT 2025

        //BLOCK 2
        String[] Citizen2 = new String[6];
        Citizen2[0] = "Amaka Nwosu";
        Citizen2[1] = "Solara State";
        Citizen2[2] = "Brighthollow LGA";
        Citizen2[3] = "FEMALE";
        Citizen2[4] = "Age 24";
        Citizen2[5] = "Voted Candidate: Obi Micheal";

        access C2 = new access("1755296820269",Citizen2, C1.getHashValue());
        block.add(C2);
        // HashValue: cd8998d78dfd568516daf3da4174761b2e7d412840a49f393805dcbd1580b3dc
        // Date and Time Created: Fri Aug 15 23:27:00 WAT 2025

        //BLOCK 3
        String[] Citizen3 = new String[6];
        Citizen3[0] = "Emeka Obi";
        Citizen3[1] = "Drakoria State";
        Citizen3[2] = "Thornvale LGA";
        Citizen3[3] = "MALE";
        Citizen3[4] = "Age 35";
        Citizen3[5] = "Voted Candidate: Okoro David";

        access C3 = new access("1755297311107",Citizen3, C2.getHashValue());
        block.add(C3);
        // HashValue: 40ec1a50ecdc665c3c7c5482259d469e4faaca3656518ba45edcf4687eecc3c2
        // Date and Time Created: Fri Aug 15 23:35:11 WAT 2025

        //BLOCK 4
        String[] Citizen4 = new String[6];
        Citizen4[0] = "Ifeoma Umeh";
        Citizen4[1] = "Veridia State";
        Citizen4[2] = "Kestrelton LGA";
        Citizen4[3] = "FEMALE";
        Citizen4[4] = "Age 30";
        Citizen4[5] = "Voted Candidate: Obi Micheal";

        access C4 = new access("1755297612211",Citizen4, C3.getHashValue());
        block.add(C4);
        // HashValue: 2ec955237261eb928b4f780e7888e7e2f8795fa1fcaebfd71ff5a16df6bbe1b8
        // Date and Time Created: Fri Aug 15 23:40:12 WAT 2025

        //BLOCK 5
        String[] Citizen5 = new String[6];
        Citizen5[0] = "Tobi Adeyemi";
        Citizen5[1] = "Solara State";
        Citizen5[2] = "Duskfield LGA";
        Citizen5[3] = "MALE";
        Citizen5[4] = "Age 22";
        Citizen5[5] = "Voted Candidate: Obi Micheal";

        access C5 = new access("1755298057740",Citizen5, C4.getHashValue());
        block.add(C5);
        // HashValue: 94ea3880825a5009d431712dc6024ee8e878c5971d2f1024818d8afa0aa3b839
        // Date and Time Created: Fri Aug 15 23:47:37 WAT 2025

        //BLOCK 6
        String[] Citizen6 = new String[6];

        Citizen6[0] = "Nneka Eze";
        Citizen6[1] = "Drakoria State";
        Citizen6[2] = "Eboncrest LGA";
        Citizen6[3] = "FEMALE";
        Citizen6[4] = "Age 27";
        Citizen6[5] = "Voted Candidate: Okoro David";

        access C6 = new access("1755298515200",Citizen6, C5.getHashValue());
        block.add(C6);
        // HashValue: 01946db5d17a16af9fe11ace3e463a8c7b0017f7304ef0365c92523ee3dd647d
        // Date and Time Created: Fri Aug 15 23:55:15 WAT 2025

        //BLOCK 7
        String[] Citizen7 = new String[6];
        Citizen7[0] = "Chukwuemeka Nnamdi";
        Citizen7[1] = "Veridia State";
        Citizen7[2] = "Arivale LGA";
        Citizen7[3] = "MALE";
        Citizen7[4] = "31";
        Citizen7[5] = "Voted Candidate: Okoro David";

        access C7 = new access("1755298998574",Citizen7, C6.getHashValue());
        block.add(C7);
        // HashValue: 0ddb1aa27101edcf4d34d2c9cdd632bb6b22e2d140082cc4064e39333a096645
        // Date and Time Created: Sat Aug 16 00:03:18 WAT 2025

        //BLOCK 8
        String[] Citizen8 = new String[6];
        Citizen8[0] = "Adaobi Onu";
        Citizen8[1] = "Solara State";
        Citizen8[2] = "Crestmoor LGA";
        Citizen8[3] = "FEMALE";
        Citizen8[4] = "Age 29";
        Citizen8[5] = "Voted Candidate: Okoro David";

        access C8 = new access("1755299246934",Citizen8, C7.getHashValue());
        block.add(C8);
        // HashValue: f4bfe3170fc508499e2d51fce4a119de7c761a14aa5790e376589d4a4b4e1b3a
        // Date and Time Created: Sat Aug 16 00:07:26 WAT 2025

        //BLOCK 9
        String[] Citizen9 = new String[6];
        Citizen9[0] = "Obinna Madu";
        Citizen9[1] = "Drakoria State";
        Citizen9[2] = "Mirabrook LGA";
        Citizen9[3] = "MALE";
        Citizen9[4] = "Age 29";
        Citizen9[5] = "Voted Candidate: Okoro David";

        access C9 = new access("1755299667860",Citizen9, C8.getHashValue());
        block.add(C9);
        // HashValue: 17262b025bca91baa5dfbd8678387a0277af62d2aa13f19edf2626058efe40d7
        // Date and Time Created: Sat Aug 16 00:14:27 WAT 2025

        //BLOCK 10
        String[] Citizen10 = new String[6];
        Citizen10[0] = "Uchechi Anyanwu";
        Citizen10[1] = "Veridia State";
        Citizen10[2] = "Fenwicke LGA";
        Citizen10[3] = "FEMALE";
        Citizen10[4] = "Age 33";
        Citizen10[5] = "Voted Candidate: Obi Micheal";

        access C10 = new access("1755300028751",Citizen10, C9.getHashValue());
        block.add(C10);
        // HashValue: 7e1fd450478aa6f9daf7242875d3ee95f300fdccda12276cdf3bf36f03a2831f
        // Date and Time Created: Sat Aug 16 00:20:28 WAT 2025

        System.out.println("**********FULL BLOCK**********");
        for (int i = 0; i < block.size() ; i++) {
            System.out.println("BLOCK " + (i + 1));
            System.out.println(block.get(i));
            System.out.println("******************************");
        }
        String combinedHash = combineallHash(block);
        System.out.println("\nCombined Hash: " + combinedHash);
        System.out.println("\n******************************");
        System.out.println("TAMPER CHECK.....");
        block.get(2).setData(Citizen3);
        Citizen3[0] = "Emeka Obi";
        boolean valid = isChainValid(block);
        System.out.println("Is Chain Valid?: " + valid);
    }
    // CHECK VALIDITY
    public static boolean isChainValid(ArrayList<access> chain) throws Exception{
        for (int i = 0; i < chain.size(); i++) {
            access current = chain.get(i);
            if (!current.getHashValue().equals(current.recalculateHash())) {
                System.out.println("Block " + i + " has been altered!!, Hash Mismatch!!!");
                return false;
            }
            if (!current.computeHash().equals(current.DataCopy())) {
                System.out.println("Original and Copy aren't the same!!!");
                return false;
            }
            if (i > 0) {
                access previous = chain.get(i - 1);
                if (!current.getPreviousHashValue().equals(previous.getHashValue())) {
                    System.out.println("Blocks " + i + " and " + (i - 1) + " aren't in sync!!!");
                    return false;
                }
            }
        }
        return true;
    }
    public static String combineallHash(ArrayList<access> allHashes) throws Exception{
        StringBuilder hash = new StringBuilder();
        for (access b: allHashes) {
            hash.append(b.getHashValue());
        }
        return access.computeSHA256(hash.toString());
    }
}
