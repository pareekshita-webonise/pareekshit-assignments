import java.util.HashSet;
import java.util.Set;

public class Restaurant {

    private HashSet<Meal> menu;
    private int givenId;

    public Restaurant(int id){
        this.givenId=id;
        this.menu=new HashSet<Meal>();
    }

    public boolean addMeal(Set<String> items,double price){
        return menu.add(new Meal(items,price));
    }

    public int contains(Set<String> request){
        int bill=0;
        HashSet<String> available=new HashSet<String>();
        for (String item:request){
            for (Meal meal:this.menu){
                if (meal.contains(item)){
                    bill+=meal.getPrice();
                    available.add(item);
                }
            }
        }
        if (available.size()==request.size()){
            return bill;
        }
        return -1;
    }

    public int hashCode(){
        return this.givenId;
    }

    public boolean equals(Restaurant other){
        return (this.givenId==other.givenId);
    }

    public int getGivenId(){
        return this.givenId;
    }
}