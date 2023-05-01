package ui;

import ingredient.Ingredient;
import recipe.Method;
import uienum.UiMessage;
import write_read_print.FileRead;
import write_read_print.PrintList;

import java.util.List;

public class UiManage {


    public static int getChoice() {
        System.out.println("Выберите действие: \n1 - Просмотреть список ингридиентов." +
                "\n2 - Добавить ингридиент." +
                "\n3 - Удалить ингридиент из списка." +
                "\n4 - Просмотреть список рецептов." +
                "\n5 - Создать новый рецепт." +
                "\nДля выхода нажмите любую букву.");
        return Method.getInteger();
    }

    public static void manage() {
        List<Ingredient> list = FileRead.readIngredientList(UiMessage.INGREDIENT_LIST.getMessage());
        int choice = getChoice();
        switch (choice) {
            case 0:
                return;
            case 1:
                PrintList.printIngredientListFromFile();
                break;
            case 2:
                Method.scanner.nextLine();
                Method.addIngrToIngredientlist();
            case 3:
                PrintList.printIngredientListFromFile();
                System.out.println("Выберите номер удаляемого ингридиента");
                int ingrChoice = Method.getInteger();
                Method.deleteIngrFromIngredientlist(list, ingrChoice);
            case 4:
                PrintList.printRecipeList(FileRead.readRecipeList());
                break;
            case 5:
                Method.createRecipe(FileRead.readIngredientList("ingredientlist.bin"));
            default:
                System.out.println("Неверный выбор.");
        }
    }
}
