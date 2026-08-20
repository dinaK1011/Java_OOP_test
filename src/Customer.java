import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Customer {
    private static Set<Integer> uniqueCustomerId = new HashSet<>();
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String deliveryAddress;
    private CustomerType customerType;
    private Integer customerDiscount;
    private ArrayList<Item> FavoriteItemsList;
    private Gift CustomerGift;

    public Customer(Integer id, String firstName, String lastName, String email, String deliveryAddress, CustomerType customerType, Integer customerDiscount, ArrayList<Item> favoriteItemsList, Gift customerGift) {
        isCustomerUnique(id);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.customerType = customerType;
        this.customerDiscount = customerDiscount;
        FavoriteItemsList = favoriteItemsList;
        CustomerGift = customerGift;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public Integer getCustomerDiscount() {
        return customerDiscount;
    }

    public ArrayList<Item> getFavoriteItemsList() {
        return FavoriteItemsList;
    }

    public Gift getCustomerGift() {
        return CustomerGift;
    }

    public static Set<Integer> getUniqueCustomerId() {
        return uniqueCustomerId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public void setCustomerDiscount(Integer customerDiscount) {
        this.customerDiscount = customerDiscount;
    }

    public void setFavoriteItemsList(ArrayList<Item> favoriteItemsList) {
        FavoriteItemsList = favoriteItemsList;
    }

    public void setCustomerGift(Gift customerGift) {
        CustomerGift = customerGift;
    }

    public static void setUniqueCustomerId(Set<Integer> uniqueCustomerId) {
        Customer.uniqueCustomerId = uniqueCustomerId;
    }

    public boolean isCustomerUnique(Integer id){
        if(uniqueCustomerId.contains(id)){
            System.out.println("The id: " + id + " is not unique, it already exists.");
            return false;
        }
        uniqueCustomerId.add(id);
        return true;
    }

    public void addToFavoriteItems(Item addItem) {
        for(Item item : this.getFavoriteItemsList()){
            if(item.getName().equalsIgnoreCase(addItem.getName())){
                System.out.println("The item: " + addItem.getName() + " is already in you're favorite list");
                return;
            }
        }
        this.FavoriteItemsList.add(addItem);
        System.out.println("The item: " + addItem.getName() + " is add to favorite list");
    }

    public void removeFromFavoriteItems(Item removeItem){
        for(Item item : this.getFavoriteItemsList()){
            if(item.getName().equalsIgnoreCase(removeItem.getName())){
                this.FavoriteItemsList.remove(item);
                System.out.println("The item : " + removeItem.getName() + " has been removed from your favorite list");
                return;
            }
        }
        System.out.println("The item : " + removeItem.getName() + " is not in you're favorite list");
    }

    public void openGift() {
        if(this.CustomerGift != null){
            System.out.println(this.firstName + "received a random gift");
            this.CustomerGift.openGift();
        } else {
            System.out.println(this.firstName + " didn't receive a gift");
        }
    }

    public void takeGift(Gift gift) {
        this.CustomerGift = gift;
    }
}
