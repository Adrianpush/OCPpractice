package StringPractice;

import java.util.ArrayList;
import java.util.List;

public class FormatTableRecords {

    public static void main(String[] args) {
        List<Record> userRecords = new ArrayList<>();
        userRecords.add(new Record("ABC", "abc@Abc.bca"));
        userRecords.add(new Record("Daniel", "Prefericit@god.ro"));
        String userName = "Protopoescu";
        String customFormat = "%-15s | %-20s%n";
        System.out.printf(customFormat, "Name" , "eMail");
        userRecords.forEach((userRecord) -> System.out.printf(customFormat, userRecord.getName(), userRecord.geteMail()));
        String.format(userName, customFormat );

    }

//    private static void formatUserRecords(List<Record> userRecords) {
//        int nameWidth =
//    }

}

class Record {
    private String name;
    private String eMail;

    public Record(String name, String eMail) {
        this.name = name;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }
}


