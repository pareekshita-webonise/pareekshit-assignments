import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Meal {

    private HashSet<String> item_list;
    private double price;

    public Meal(String item, double prc){
        this.item_list=new HashSet<String>();
        this.item_list.add(item);
        this.price=prc;
    }

    public Meal(Set<String> items, double prc){
        this.item_list=new HashSet<String>();
        Iterator<String> iterator=items.iterator();
        while (iterator.hasNext()){
            this.item_list.add(iterator.next());
        }
        this.price=prc;
    }

    public boolean contains(String item){
        for (String string:this.item_list){
            if (string.equals(item)){
                return true;
            }
        }
        return false;
    }

    public double getPrice(){
        return this.price;
    }

    public int hashCode(){
        return (int)(this.price+this.item_list.hashCode());
    }

    public boolean equals(Meal other){
        if (this.item_list.size()==other.item_list.size()){
            Iterator<String> iterator=other.item_list.iterator();
            while (iterator.hasNext()){
                if (!(this.item_list.contains(iterator.next()))){
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}