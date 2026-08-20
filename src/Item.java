import java.util.HashSet;
import java.util.Set;

public class Item {
    private Set<Integer> uniqueItemId = new HashSet<>();
    private Integer id;
    private String name;
    private Integer price;

    public Item(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Set<Integer> getUniqueItemId() {
        return uniqueItemId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setUniqueItemId(Set<Integer> uniqueItemId) {
        this.uniqueItemId = uniqueItemId;
    }

    public boolean isIdUnique(Integer id){
        if(uniqueItemId.contains(id)){
            System.out.println("The id: " + id + " is not unique, it already exists.");
            return false;
        }
        uniqueItemId.add(id);
        return true;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
