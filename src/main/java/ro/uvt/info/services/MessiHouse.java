package ro.uvt.info.services;

public class MessiHouse implements HouseStrategy {
    @Override
    public void printMessage(String message) {
        System.out.println("Mesaj from Messi: " + message);
    }
}
