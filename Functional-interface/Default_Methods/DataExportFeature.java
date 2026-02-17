public class DataExportFeature {
    interface Exporter { void export(String data); default void exportToJSON(String data){ System.out.println("JSON: " + data); } }
    static class CSV implements Exporter { public void export(String data){ System.out.println("CSV: " + data); } }
    public static void main(String[] args){
        CSV c = new CSV();
        c.export("report");
        c.exportToJSON("report");
    }
}
