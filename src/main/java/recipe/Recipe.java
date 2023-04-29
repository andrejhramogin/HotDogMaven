package recipe;

import ingredient.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter

public class Recipe implements Serializable  {

    private static final long serialVersionUID = 1L;

    private List<Ingredient> list;

    private int sequenceNumber;

    private int quantityHotDog;

    public Recipe(int sequenceNumber, List<Ingredient> list, int quantityHotDog){
        this.sequenceNumber = sequenceNumber;
        this.list = list;
        this.quantityHotDog = quantityHotDog;
    }

    public Recipe(){}
}
