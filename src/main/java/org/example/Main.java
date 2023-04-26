package org.example;

import order.Order;
import order.OrderMethod;
import recipe.Method;
import write_read_print.FileRead;
import write_read_print.PrintList;

import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Создание нового заказа
        //Запись заказа в файл
        //Вывод списка заказов на консоль
        OrderMethod.createOrder(FileRead.readRecipeList());
        List<Order> orderList = FileRead.readOrderList();
        PrintList.printOrderList(orderList);



        //добавить ингредиент в список ингредиентов
        //Вывод списка ингредиентов
//        Method.addIngrToIngredientlist();
//        PrintList.printFileIngredientlist();



        //вывести список рецептов
        //создать новый рецепт
//        PrintList.printRecipeList(FileRead.readRecipeList());
//        Method.createRecipe(FileRead.readIngredientList("ingredientlist.bin"));
    }
}

