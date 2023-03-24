public class Main {
            public static void main(String[] args) {
                System.out.println("Hello world!");
                GroceryList list =new GroceryList();
                GroceryItemOrder hala =new GroceryItemOrder("apples",1.5);
                hala.setItemQuantity(2);
                list.add(hala);
                GroceryItemOrder hala2 =new GroceryItemOrder("bananas",2.0);
                hala2.setItemQuantity(3);
                list.add(hala2);
                System.out.println(list.getTotalCost());
            }
        }



