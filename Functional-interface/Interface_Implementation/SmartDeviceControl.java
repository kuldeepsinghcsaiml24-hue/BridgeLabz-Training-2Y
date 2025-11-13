public class SmartDeviceControl {
    interface SmartDevice { void turnOn(); void turnOff(); }
    static class Light implements SmartDevice { public void turnOn(){System.out.println("Light ON");} public void turnOff(){System.out.println("Light OFF");} }
    static class AC implements SmartDevice { public void turnOn(){System.out.println("AC ON");} public void turnOff(){System.out.println("AC OFF");} }
    static class TV implements SmartDevice { public void turnOn(){System.out.println("TV ON");} public void turnOff(){System.out.println("TV OFF");} }
    public static void main(String[] args){
        SmartDevice[] devices = { new Light(), new AC(), new TV() };
        for(SmartDevice d: devices){ d.turnOn(); d.turnOff(); }
    }
}
