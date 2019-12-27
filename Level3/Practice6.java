package Level3;

public class Practice6 {
    public static void main(String[] args) {
        shipment ship1 = new shipment(100, 3, 234.5, 100, 75, "US", 0);

        System.out.println(ship1.getShipping_id());
    }
}


class shipment {
    private int shipping_id;
    private int quantity_to_ship;
    private double package_weight;
    private double height;
    private double width;
    private String country;
    private int per_tax;

    public shipment(int shipping_id, int quantity_to_ship, double package_weight, double height, double width, String country, int per_tax) {
        this.shipping_id = shipping_id;
        this.quantity_to_ship = quantity_to_ship;
        this.package_weight = package_weight;
        this.height = height;
        this.width = width;
        this.country = country;
        this.per_tax = per_tax;
    }

    public int getShipping_id() {
        return shipping_id;
    }

    public void setShipping_id(int shipping_id) {
        this.shipping_id = shipping_id;
    }

    public int getQuantity_to_ship() {
        return quantity_to_ship;
    }

    public void setQuantity_to_ship(int quantity_to_ship) {
        this.quantity_to_ship = quantity_to_ship;
    }

    public double getPackage_weight() {
        return package_weight;
    }

    public void setPackage_weight(double package_weight) {
        this.package_weight = package_weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPer_tax() {
        return per_tax;
    }

    public void setPer_tax(int per_tax) {
        this.per_tax = per_tax;
    }
}
