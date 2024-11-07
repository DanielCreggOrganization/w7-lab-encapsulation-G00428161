package ie.atu.encapsulation;

public class Main2 {
public static void main(String args){
    Temperature temp = new Temperature();
    temp.setCelsius(25);
    System.out.print("Temperature is celsius: " + temp.getCelsius());
}
}
