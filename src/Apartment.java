import java.util.Arrays;

public class Apartment {
    private String title;
    private int price;
    private String address;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    int payPerMonth(Studentter[] studentters) {
        int counter = 0;
        for (Studentter studentter:studentters) {
            if(studentter.getAddress().equals(address)){
                counter++;
            }
        }
        int rent = price/counter;
        return rent;
    }
}
