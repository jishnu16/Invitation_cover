import java.io.IOException;
import java.util.ArrayList;

public class LabelPrinter {
    public static void main(String[] args) throws IOException {
        ArrayList<String> guestNameList;
        ArrayList<String[]> records = new ReadData(args[args.length-1]).readGuest();
        ProcessOption options = new ProcessOption(args,records);
        guestNameList = options.processedOption();
        for (String name : guestNameList) {
            System.out.println(name);
        }
    }
}
