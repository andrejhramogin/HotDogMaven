package order;

import recipe.Method;
import recipe.Recipe;
import uienum.UiMessage;
import write_read_print.FileRead;
import write_read_print.FileWrite;
import write_read_print.PrintList;

import java.util.ArrayList;
import java.util.List;

public class OrderMethod {

    public static void createOrder(List<Recipe>list){
        PrintList.printRecipeList(list);
        List<Order> orderList = FileRead.readOrderList();
//        List<Order>orderList = new ArrayList<>();
         List<Recipe> order = new ArrayList<>();
        int sequenceNumber;

        if(orderList.isEmpty()){
            System.out.println(UiMessage.EMPTY_LIST.getMessage());
            sequenceNumber = 1;
        }else{
            sequenceNumber = orderList.get(orderList.size()-1).getSequenceNumber() + 1;
        }

        System.out.println("Выберите рецепт:\nДля завершения выбора нажмите любую букву");
        while (Method.scanner.hasNextInt()) {
            int choice = Method.getInteger();
            System.out.println(UiMessage.QUANTITY.getMessage());
            int quantity = Method.getInteger();
            list.get(choice-1).setQuantityHotDog(quantity);
            order.add(list.get(choice-1));
        }
        orderList.add(new Order(sequenceNumber, order));
        FileWrite.writeOrderList(orderList);
    }
}