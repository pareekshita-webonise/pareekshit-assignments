import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<Restaurant> resturants=new HashSet<Restaurant>();
        Scanner scanner=new Scanner(new File(args[0]));
        HashSet<String> request=new HashSet<String>();
        int arglen=args.length;
        for (int i=0;i<arglen;i++){
            request.add(args[i].trim());
        }
        while (scanner.hasNextLine()){
            String sentence=scanner.nextLine();
            Scanner scanner1=new Scanner(sentence);
            scanner1.useDelimiter(",");
            int i=0;
            int resturant_id=0;
            double price=0.0;
            HashSet<String> items=new HashSet<String>();
            while (scanner1.hasNext()){
                String temp=scanner1.next();
                temp=temp.trim();
                if (i==0){
                    resturant_id=Integer.parseInt(temp);
                }else if (i==1){
                    price=Double.parseDouble(temp);
                }else if (i==2){
                    items=new HashSet<String>();
                    items.add(temp);
                }else {
                    items.add(temp);
                }
                i++;
            }
            boolean flag=true;
            loop:
            for (Restaurant restaurant:resturants){
                if (restaurant.getGivenId()==resturant_id){
                    restaurant.addMeal(items,price);
                    flag=false;
                    break loop;
                }
            }
            if (flag){
                Restaurant restaurant=new Restaurant(resturant_id);
                restaurant.addMeal(items,price);
                resturants.add(restaurant);
            }
        }
        int restaurant_id=-1;
        double bill=Double.MAX_VALUE;
        double temp=0.0;
        for (Restaurant restaurant:resturants) {
            if ((temp=restaurant.contains(request))>=0.0){
                if(temp<bill){
                    bill=temp;
                    restaurant_id=restaurant.getGivenId();
                }
            }
        }
        if (restaurant_id==-1){
            System.out.println("Sorry!! No match Found!");
        }else {
            System.out.println(restaurant_id+", "+bill);
        }
        scanner.close();
    }
}