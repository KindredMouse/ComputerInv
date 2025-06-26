public class Computer {
    private String brand;
    private double price;
    private int stock;

    public Computer(String brand, double price, int stock) {
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void restock(int amount) {
        if (amount > 0) {
            stock += amount;
        }
    }

    public boolean sell(int quantity) {
        if (quantity <= stock && quantity > 0) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public String getSummary() {
        return "Brand: " + brand + "\nPrice: $" + price + "\nIn Stock: " + stock;
    }
}
