public class DataSerializationBackup {
    interface BackupSerializable {}
    static class DataFile implements BackupSerializable { String name="data.bin"; }
    public static void main(String[] args){
        DataFile f = new DataFile();
        System.out.println((f instanceof BackupSerializable) ? "Serializable for backup" : "Not serializable");
    }
}
