class Thermostat extends Device {
    double temperatureSetting;
    Thermostat(String deviceId,String status,double temperatureSetting){super(deviceId,status);this.temperatureSetting=temperatureSetting;}
    void displayStatus(){ super.displayStatus(); System.out.println("TempSetting:"+temperatureSetting); }
}