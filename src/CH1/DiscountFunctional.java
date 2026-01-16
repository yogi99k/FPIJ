package CH1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiscountFunctional {
    public double discountFun(List<Integer> prices){
        double totalOfDiscountedPrice = 0.0;
        for(int price: prices){
            if(price>20){
                totalOfDiscountedPrice += price * 0.9;
            }
        }
        return totalOfDiscountedPrice;
    }
    public double discountFunOP(List<Integer> prices){
        double result = prices.stream()
                .filter(price -> price > 20)
                .mapToDouble(price -> price * 0.9)
                .sum();
        return result;
    }
    public static void main(String args[]){
        DiscountFunctional discountFunctional = new DiscountFunctional();
        List<Integer> arr = Arrays.asList(10, 30, 17, 20, 18, 45, 12);
        double v = discountFunctional.discountFun(arr);
        System.out.println("op :"+discountFunctional.discountFunOP(arr));
        System.out.println("no-op :"+ v);
    }
}
