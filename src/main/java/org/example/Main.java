package org.example;

import ingredient.Bun;
import ingredient.Ingredient;
import order.Order;
import order.OrderMethod;
import recipe.Method;
import write_read_print.FileRead;
import write_read_print.FileWrite;
import write_read_print.PrintList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//        OrderMethod.createOrder(FileRead.readRecipeList());
//        List<Order> orderList = FileRead.readOrderList();
//        PrintList.printOrderList(orderList);


//        Method.addIngrToIngredientlist();
        //Вывод списка ингредиентов
//        PrintList.printFileIngredientlist();

        Method.createRecipe(FileRead.readIngredientList("ingredientlist.bin"));
    }
}

