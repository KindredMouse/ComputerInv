import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
    String brand = JOptionPane.showInputDialog("Enter the brand");
    String price = JOptionPane.showInputDialog("Enter the price");
    double priceDouble = Double.parseDouble(price);
    String stock = JOptionPane.showInputDialog("Enter the stock");
    int stockInt = Integer.parseInt(stock);

    Computer computer = new Computer(brand,priceDouble,stockInt);

    String[]options = {"View Summary","Restock","Sell","Exit"};
    int choice;
    do{
        choice = JOptionPane.showOptionDialog(null,"Choose an option","Store Menu",
                 JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
        switch(choice){
            case 0:
                JOptionPane.showMessageDialog(null,"Brand: " + computer.getBrand() + "\nPrice: " +
                        "$" + computer.getPrice() + "\nIn Stock: " + computer.getStock());
                break;
            case 1:
                String restockStr = JOptionPane.showInputDialog("Enter the amount being restocked");
                int restockInt = Integer.parseInt(restockStr);
                computer.restock(restockInt);
                break;
            case 2:
                String sellStr = JOptionPane.showInputDialog("Enter the amount being sold");
                int soldInt = Integer.parseInt(sellStr);
                computer.sell(soldInt);
                break;
        }
    } while (choice != 3);
    }
}