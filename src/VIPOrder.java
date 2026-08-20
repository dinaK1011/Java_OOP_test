import java.time.LocalDate;
import java.util.ArrayList;

public class VIPOrder extends Order{
    public VIPOrder(Integer id, String name, String deliveryAddress, ArrayList<Item> itemsList, Customer customerOrder, PaymentType paymentType, LocalDate date) {
        super(id, name, deliveryAddress, itemsList, customerOrder, paymentType, date);
        this.calculateTotalPrice();
    }


    @Override
    public void calculateTotalPrice(){
        if(getCustomerOrder().getCustomerType() != CustomerType.VIP){
            throw new IllegalArgumentException("Error: You are trying to place an order as an VIP customer, You are not a VIP customer!");
        }
        Integer totalOrderPrice = 0;
        Integer discount = getCustomerOrder().getCustomerDiscount();
        for(Item item : this.getItemsList()){
            totalOrderPrice += item.getPrice();
        }
        if(discount != null){
            totalOrderPrice -= (totalOrderPrice * discount / 100);
        }
        setTotalOrderPrice(totalOrderPrice);
    }
}
