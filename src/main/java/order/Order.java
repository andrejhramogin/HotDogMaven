package order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import recipe.Recipe;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor

public class Order implements Serializable {
private static final long serialVersionUID = 1;

    private int sequenceNumber;
    List<Recipe> recipeList = new ArrayList<>();

//    public Order(int sequenceNumber, List<Recipe> recipeList) {
//        this.sequenceNumber = sequenceNumber;
//        this.recipeList = recipeList;
//    }
//
//    public int getSequenceNumber() {
//        return sequenceNumber;
//    }
//
//    public void setSequenceNumber(int sequenceNumber) {
//        this.sequenceNumber = sequenceNumber;
//    }
//
//    public List<Recipe> getRecipeList() {
//        return recipeList;
//    }
//
//    public void setRecipeList(List<Recipe> recipeList) {
//        this.recipeList = recipeList;
//    }
}
