public class Food {

    public String name;
    public String foodtype;
    public static String[] meatlist = new String[10];
    public static String[] fruitveggielist = new String[10];

    public Food(String name, String foodtype){

        this.name = name;
        this.foodtype = foodtype;
        

    }

    public static void sortfood(Food f){

        if (f.foodtype == "meat"){
            meatlist[0] = f.name;
        if (f.foodtype == "fruit" || f.foodtype == "veggie"){
            fruitveggielist[0] = f.name;
        }
            
        }
    }

    public static void main(String[] args) {
        Food apple = new Food("apple", "fruit");
        Food ham = new Food("ham", "meat");
        sortfood(apple);
        sortfood(ham);
        System.out.println(meatlist.toString());
        System.out.println(fruitveggielist.toString());

        // System.out.println(fruit[].class);
        // System.out.println(meat[].class);
    }
}