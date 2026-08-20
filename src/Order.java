import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

abstract public class Order {
    private static Set<Integer> uniqueOrderId = new HashSet<>();
    private Integer id;
    private String name;
    private String deliveryAddress;
    private ArrayList<Item> itemsList;
    private Customer customerOrder;
    private Integer totalOrderPrice;
    private PaymentType paymentType;
    private LocalDate orderDate;

    public Order(Integer id, String name, String deliveryAddress, ArrayList<Item> itemsList, Customer customerOrder, PaymentType paymentType, LocalDate date) {
        isIdUnique(id);
        this.id = id;
        this.name = name;
        this.deliveryAddress = deliveryAddress;
        this.itemsList = itemsList;
        this.customerOrder = customerOrder;
        this.paymentType = paymentType;
        orderDate = date;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public ArrayList<Item> getItemsList() {
        return itemsList;
    }

    public Customer getCustomerOrder() {
        return customerOrder;
    }

    public Integer getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public Set<Integer> getUniqueId() {
        return uniqueOrderId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setItemsList(ArrayList<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public void setCustomerOrder(Customer customerOrder) {
        this.customerOrder = customerOrder;
    }

    public void setTotalOrderPrice(Integer totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void setUniqueId(Set<Integer> uniqueId) {
        this.uniqueOrderId = uniqueId;
    }

    public boolean isIdUnique(Integer id){
        if(getUniqueId().contains(id)){
            System.out.println("The id: " + id + " is not unique, it already exists.");
            return false;
        }
        getUniqueId().add(id);
        return true;
    }

    abstract public void calculateTotalPrice();
}
