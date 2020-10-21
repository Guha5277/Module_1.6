package guhar4k.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class SecurityCheckpointRunner {
    public static void main(String[] args) {
        List<SecurityCheckpointRecord> checkpointRecords = new ArrayList<>();
        SecurityCheckpointRecord record = new SecurityCheckpointRecord("John");
        SecurityCheckpointRecordFactory factory = new SecurityCheckpointRecordFactory(record);
        checkpointRecords.add(factory.copy());

        record.registerNewPerson("Elizabeth");
        checkpointRecords.add(factory.copy());

        record.registerNewPerson("David");
        checkpointRecords.add(factory.copy());

        for (SecurityCheckpointRecord rec : checkpointRecords) {
            System.out.println(rec);
        }
    }
}
