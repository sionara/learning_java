import java.util.*; 

class FoodManager {

    public static String[] meatlist = new String[10];
    public static String[] fruitveggielist = new String[10];

    public static void sortFood(Food f){

        if (f.foodtype == "meat"){
            meatlist[0] = f.name;
        }
        if (f.foodtype == "fruit" || f.foodtype == "veggie"){
            fruitveggielist[0] = f.name;
        }    
    }
    public static void main(String[] args){
        
        Food apple = new Food("apple", "fruit");
        Food ham = new Food("ham", "meat");
        
        FoodManager.sortFood(apple);
        FoodManager.sortFood(ham);

        System.out.println(Arrays.toString(meatlist));
        System.out.println(Arrays.toString(fruitveggielist));

    }
}