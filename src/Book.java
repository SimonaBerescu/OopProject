public class Book {
    String Author = "Jules Verne";
    String Title = "Ocolul pamantului in 80 zile";
    double price = 50.00;

    public double getPrice(){
        return price;
    }

    public String showAuthorAndTitle(){
        return ("Book "+Title+" is written by "+Author);
    }
    public static void showILoveBooks(){
        System.out.println("I Love Books");
    }
//public static class se poate apela si fara a crea obiecte
}
