import model.*;
import model.constants.*;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
Food meat = new Meat(5,100);
Food redApple = new Apple(10,50,Colour.RED);
Food greenApple = new Apple(8,60,Colour.GREEN);
Food[] productCart = { meat, redApple, greenApple };
ShoppingCart shoppingCart = new ShoppingCart(productCart);
System.out.println("Общая сумма товаров без скидки = " + shoppingCart.getTotalPrice());
System.out.println("Общая сумма товаров со скидкой = " + shoppingCart.getTotalPriceWithDiscount());
System.out.println("Сумма всех вегетарианских продуктов без скидки = " + shoppingCart.getVegetarianTotalPrice());


    }
}
