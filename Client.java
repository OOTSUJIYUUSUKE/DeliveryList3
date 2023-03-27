import java.time.LocalDate;

public class Client {
    private String name;               //名前
    private LocalDate deliveryDate;    //配達日
    private int deliveryTime;       //配達時間
    private int quantity;              //配達個数

    //コンストラクタ
    public Client(String name, LocalDate deliveryDate, int deliveryTime, int quantity) {
        this.name = name; this.deliveryDate = deliveryDate; this.deliveryTime = deliveryTime; this.quantity = quantity;
    }

    //Getter
    public String getName() {
        return name;
    }
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    public int getDeliveryTime() {
        return deliveryTime;
    }
    public int getQuantity() {
        return quantity;
    }
}
