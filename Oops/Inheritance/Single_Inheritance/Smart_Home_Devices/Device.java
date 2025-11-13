class Device {
    String deviceId; String status;
    Device(String deviceId,String status){this.deviceId=deviceId;this.status=status;}
    void displayStatus(){ System.out.println("Device:"+deviceId+", Status:"+status); }
}