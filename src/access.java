import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;

public class access {

    private String TimeRecorded = String.valueOf(System.currentTimeMillis());
    private String[][] Data;
    private String[][] DataCopy;
    private String HashValue;
    private String PreviousHashValue;

    public access(String TimeRecorded, String[][] Data, String PreviousHashValue) throws Exception{
        this.TimeRecorded = TimeRecorded;
        this.Data = Data;
        this.DataCopy = new String[Data.length][];
        for (int i = 0; i < Data.length; i++) {
            this.DataCopy = Arrays.copyOf(Data, Data.length);
        }
        this.PreviousHashValue = PreviousHashValue;
        this.HashValue = computeHash();
    }
    public String computeHash() throws Exception{
        String datatohash = TimeRecorded + Arrays.deepToString(Data) + PreviousHashValue;
        return computeSHA256(datatohash);
    }
    public String DataCopy() throws Exception{
        String datatohash = TimeRecorded + Arrays.deepToString(Data) + PreviousHashValue;
        return computeSHA256(datatohash);
    }
    public static String computeSHA256(String input)throws Exception{
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        // Now HEX
        StringBuilder gethex = new StringBuilder();
        for (byte b: bytes){
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                gethex.append('0');
            }
            gethex.append(hex);
        }
        return gethex.toString();
    }
    public String recalculateHash() throws Exception{
        return computeHash();
    }

    public String getTimeRecorded() {
        return TimeRecorded;
    }

    public void setTimeRecorded(String timeRecorded) {
        TimeRecorded = timeRecorded;
    }

    public String[][] getData() {
        return Data;
    }

    public void setData(String[][] data) {
        Data = data;
    }

    public String[][] getDataCopy() {
        return DataCopy;
    }
    public String getHashValue() {
        return HashValue;
    }

    public String getPreviousHashValue() {
        return PreviousHashValue;
    }

    public void setPreviousHashValue(String previousHashValue) {
        PreviousHashValue = previousHashValue;
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

    @Override
    public String toString() {
        return
                "Time Recorded: " + TimeRecorded +
                        "\nData: " + Arrays.deepToString(Data) +
                        "\nHash Value: " + HashValue.substring(0, 16)  + "...." +
                        "\nPrevious Hash Value: " + PreviousHashValue;
    }
}
