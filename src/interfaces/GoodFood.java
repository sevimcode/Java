package interfaces;

public interface GoodFood extends Food, Eatable{ // we can have multiple extends

// Goodfood inheriting all of the properties from Food and Eatable
    void getFood();
}
