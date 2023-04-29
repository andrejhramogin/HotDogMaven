package ingredient;

import recipe.Method;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Ingredient implements Serializable   {

    public String name;//наименование ингридиента
    public double costPrice; //себестоимость
    public double retailPrice;//розничная цена
    public int reserve; //запас продукта
    public int recipeQuantity; //количесвто шт/доз ингридиента в рецепте

    public Ingredient(String name, int recipeQuantity, double costPrice, double retailPrice, int reserve) {
        this.name = name;
        this.recipeQuantity = recipeQuantity;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
        this.reserve = reserve;
    }

    public Ingredient(String name){
        this.name = name;
    }

    public Ingredient() {

    }

    public String toString() {
        return (name + " " + recipeQuantity + " " + costPrice + " " + retailPrice + " " + reserve + "\n");
    }

    public static Ingredient createIngredient(){
        Ingredient i = new Ingredient();
        System.out.println("Enter the name of ingredient:");
        i.setName(Method.getString());
        System.out.println("Enter the cost price:");
        i.setCostPrice(Method.getDouble());
        System.out.println("Enter the retail price:");
        i.setRetailPrice(Method.getDouble());
        System.out.println("Enter the reserve:");
        i.setReserve(Method.getInteger());
        return i;
    }
}
