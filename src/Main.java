//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args){
    Item computer = new Item(10, "Computer", 1200);
    Item mouse = new Item(20, "Mouse", 120);
    Item speakers = new Item(24, "Speakers", 400);
    Item mousePad = new Item(27, "Mouse pad", 30);
    Item memoryCard = new Item(40, "Memory card", 700);
    Item keyboard = new Item(50, "Keyboard", 80);

    ArrayList<Item> adiOrderList = new ArrayList<>();
    adiOrderList.add(computer);
    adiOrderList.add(keyboard);
    adiOrderList.add(mouse);
    System.out.println(adiOrderList);

    ArrayList<Item> idanOrderList = new ArrayList<>();
    idanOrderList.add(memoryCard);
    idanOrderList.add(computer);
    idanOrderList.add(mousePad);
    idanOrderList.add(speakers);
    System.out.println(idanOrderList);

    ArrayList<Item> maayanOrderList = new ArrayList<>();
    maayanOrderList.add(speakers);
    System.out.println(maayanOrderList);

    Gift coupon = new RandomGift<String>("Coupon for 200 off");
    Gift cheapestItem = new RandomGift<String>("The cheapest one on the list is free");


    Customer idan = new Customer(400, "Idan", "Halevi", "idan0820@gmail.com", "Haifa", CustomerType.REGULAR, null, idanOrderList, coupon);
    Customer adi = new Customer(404, "Adi", "Ofir", "adidushO@gmail.com", "Kiryat Yam", CustomerType.VIP, 25, adiOrderList, cheapestItem);
    Customer maayan = new Customer(406, "Maayan", "Elul", "Maayani@gmail.com", "Tel Aviv", CustomerType.VIP, 14, maayanOrderList, null);

    System.out.println("Order for Idan:");
    Order order1 = new RegularOrder(1, "Idan's Order", "Haifa", idanOrderList, idan, PaymentType.CREDITCARD, LocalDate.now());
    System.out.println("Idan Total Price: " + order1.getTotalOrderPrice());

    System.out.println("Order for Adi:");
    Order order2 = new RegularOrder(1, "Adi's Order", "Kiryat Yam", adiOrderList, adi, PaymentType.CHECK, LocalDate.now());    System.out.println("Adi Total Price: " + order2.getTotalOrderPrice());

    Order vipOrder = new VIPOrder(3, "Adi's VIP Order", "Kiryat Yam", adiOrderList, adi, PaymentType.CHECK, LocalDate.now());
    System.out.println("Adi's VIP Total Pricewith discount" + vipOrder.getTotalOrderPrice());

    Item newItemToList = new Item(52, "Webcam", 300);
    adi.addToFavoriteItems(newItemToList);
    adi.removeFromFavoriteItems(mouse);



    idan.takeGift(coupon);
    idan.openGift();
    maayan.openGift();





}
