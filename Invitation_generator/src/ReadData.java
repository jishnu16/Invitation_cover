import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadData {
    private final String fileName;

    public ReadData(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<String[]> readGuest() throws IOException {
        BufferedReader readBuffer;
        readBuffer = new BufferedReader(new FileReader(this.fileName));
        ArrayList<String[]> list = new ArrayList<>();
        String eachLine;
        while ((eachLine = readBuffer.readLine()) != null) {
            String[] guest = eachLine.split(",");
            list.add(guest);
        }
        return list;
    }
}

