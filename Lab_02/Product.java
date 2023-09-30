package Lab_02;

public class Product {

    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter = 1;
    private Date mfcdate;

    Product(String name, double price, int quantity, Date mfcdate) {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.mfcdate = mfcdate;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setMfcdate(Date mfcdate) {
        this.mfcdate = mfcdate;
    }

    public Date getMfcdate() {
        return mfcdate;
    }

    public String toString() {
        return String.format("%04d\t %S\t %.02f\t %d\t %s", id, name, price, quantity, mfcdate);
    }

    public Product isLatest(Product p1, Product p2) {
        Date latest;
        latest = mfcdate.isLatest(p1.getMfcdate(), p2.getMfcdate());
        if (latest == p1.getMfcdate()) {
            return p1;
        } else {
            return p2;
        }
    }
}


