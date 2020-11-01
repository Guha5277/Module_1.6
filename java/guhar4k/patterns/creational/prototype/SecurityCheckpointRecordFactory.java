package guhar4k.patterns.creational.prototype;

public class SecurityCheckpointRecordFactory {
    SecurityCheckpointRecord record;

    public SecurityCheckpointRecordFactory(SecurityCheckpointRecord record) {
        this.record = record;
    }

    public SecurityCheckpointRecord copy(){
        return (SecurityCheckpointRecord) record.copy();
    }
}
