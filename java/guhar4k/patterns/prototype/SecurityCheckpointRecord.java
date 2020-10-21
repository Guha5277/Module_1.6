package guhar4k.patterns.prototype;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class SecurityCheckpointRecord implements Copyable{
    private String lastPersonNameToEnter;
    private LocalDateTime dateTime;

    public SecurityCheckpointRecord(String lastPersonNameToEnter) {
        this.lastPersonNameToEnter = lastPersonNameToEnter;
        dateTime = LocalDateTime.now();
    }

    public void registerNewPerson(String lastPersonNameToEnter) {
        this.lastPersonNameToEnter = lastPersonNameToEnter;
        dateTime = LocalDateTime.now();
    }

    private void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public Object copy() {
        SecurityCheckpointRecord record = new SecurityCheckpointRecord(lastPersonNameToEnter);
        record.setDateTime(dateTime);
        return record;
    }

    @Override
    public String toString() {
        return lastPersonNameToEnter + " : " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(dateTime);
    }
}
