package ro.uvt.info.services;

public class AtreidesHouse implements HouseStrategy {
    @Override
    public void printMessage(String message) {
        System.out.println("Mesaj from Atreides: " + message);
    }
}
