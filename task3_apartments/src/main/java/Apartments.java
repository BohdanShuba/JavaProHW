public class Apartments {

    private String district;
    private String street;
    private int building;
    private int number;
    private double area;
    private double price;

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dst. " + district +
                ", \tSt. " + street +
                ", \tBldg. " + building +
                ", \tAp. " + number +
                ",  \tArea " + area +
                ",  \tPrice " + price;
    }
}
