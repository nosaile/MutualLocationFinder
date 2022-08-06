package data;

public class Location {

    private String address;

    public Location(String address) {
        this.address = address;
    }

    public Location(){

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Location{" +
                "address='" + address + '\'' +
                '}';
    }
}
