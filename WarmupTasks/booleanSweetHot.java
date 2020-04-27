package WarmupTasks;

public class booleanSweetHot {

    public static void main(String[] args) {
/*
        boolean sweet = true;
        boolean hot = (sweet = false);
        System.out.println(sweet);
        System.out.println(hot);

 */


        System.out.println("==============");

        String drink = "tea";
        boolean hot = true;
        boolean free = true;

        boolean bool = drink.equals("coffee") && hot && free;
        bool = drink.equals("coffee") & hot;
        bool = drink.equals("coffee") && hot;
        System.out.println(bool);



    }
}
