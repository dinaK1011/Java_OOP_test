import java.time.LocalDate;
import java.util.ArrayList;

public class RegularOrder extends Order{
    public RegularOrder(Integer id, String name, String deliveryAddress, ArrayList<Item> itemsList, Customer customerOrder, PaymentType paymentType, LocalDate date) {
        super(id, name, deliveryAddress, itemsList, customerOrder, paymentType, date);
        this.calculateTotalPrice();
    }

    @Override
    public void calculateTotalPrice(){
        Integer totalOrderPrice = 0;
        for(Item item : this.getItemsList()){
            totalOrderPrice += item.getPrice();
        }
        setTotalOrderPrice(totalOrderPrice);
    }
}
