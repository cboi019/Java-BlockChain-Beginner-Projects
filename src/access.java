import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;

public class access {

    private String TimeRecorded = String.valueOf(System.currentTimeMillis());
    private String[] Data;
    private String[] DataCopy;
    private String HashValue;
    private String PreviousHashValue;

    public access(String TimeRecorded, String[] Data, String PreviousHashValue) throws Exception{
        this.TimeRecorded = TimeRecorded;
        this.Data = Data;
        this.DataCopy = Arrays.copyOf(Data, Data.length);
        this.PreviousHashValue = PreviousHashValue;
        this.HashValue = computeHash();
    }
    public String computeHash() throws Exception{
        String datatohash = TimeRecorded + Arrays.toString(Data) + PreviousHashValue;
        return computeSHA256(datatohash);
    }
    public String DataCopy() throws Exception{
        String datatohash = TimeRecorded + Arrays.toString(Data) + PreviousHashValue;
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

    public String[] getData() {
        return Data;
    }

    public void setData(String[] data) {
        Data = data;
    }

    public String[] getDataCopy() {
        return DataCopy;
    }

    public void setDataCopy(String[] dataCopy) {
        DataCopy = dataCopy;
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

    @Override
    public String toString() {
        return
                "Time Recorded: " + TimeRecorded +
                "\nData: " + Arrays.toString(Data) +
                "\nHash Value: " + HashValue  +
                "\nPrevious Hash Value: " + PreviousHashValue;
    }
}
