class Electronics {
public Electronics(){
System.out.println("Class Electronics");
}
public void deviceType() {
System.out.println("Device Type: Electronic");
}
}
class Television extends Electronics {
public Television() {
System.out.println("Class Television");
}
public void category() {
System.out.println("Category - Television");
}
}
class SmartTV extends Television {
public SmartTV() {
System.out.println("SmartTV");
}
public void display_tech() {
System.out.println("Display Technology- SmartTV");
}

}
public class Exp_8b {
public static void main(String[] arguments) {
SmartTV led = new SmartTV();
led.deviceType();
led.category();
led.display_tech();
}
}
