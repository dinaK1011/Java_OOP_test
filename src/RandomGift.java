public class RandomGift<T> implements Gift {
    private T gift;

    public RandomGift(T gift) {
        this.gift = gift;
    }

    public T getRandomGift() {
        return gift;
    }

    public void setRandomGift(T gift) {
        this.gift = gift;
    }

    @Override
    public void openGift() {
        System.out.println("Congratulations! you got a new gift! Enjoy!");
        if (this.gift != null) {
            System.out.println("Your gift is: " + this.gift);
        }
    }


}