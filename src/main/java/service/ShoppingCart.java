package service;
import model.*;
public class ShoppingCart {

    private Food[] productCart;


    public ShoppingCart(Food[] productCart) {

        this.productCart = productCart;
    }
    private double getProductPrice(Food product){//Общая стоимость продукта с учетом кол-ва
        return product.getAmount() * product.getPrice();
    }


    public double getTotalPrice() {//Сумма всех товаров, без учета скидки
        double totalPrice = 0;
        for (int i = 0; i < productCart.length; i++) {
            totalPrice += getProductPrice(productCart[i]);
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {//Сумма всех товаров, с учетом скидки
        double totalPriceWithDiscount = 0;
        for (int i = 0; i < productCart.length; i++) {
                totalPriceWithDiscount += (getProductPrice(productCart[i])) * (1 - (productCart[i].getDiscount() / 100));

        }
        return totalPriceWithDiscount;
        }


    public double getVegetarianTotalPrice(){//Сумма всех вегетарианских товаров, без учета скидки
        double totalVegetarianPrice = 0;
        for (int i = 0; i < productCart.length; i++) {
            if(productCart[i].isVegetarian()){
                totalVegetarianPrice+= getProductPrice(productCart[i]);
            }

        }
        return totalVegetarianPrice;
    }

}
