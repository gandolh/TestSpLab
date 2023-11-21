package ro.uvt.info.services;

public class HarkonnenHouse implements HouseStrategy {
    @Override
    public void printMessage(String message) {
        System.out.println("Mesaj from harkonen: " + message);
    }
}
