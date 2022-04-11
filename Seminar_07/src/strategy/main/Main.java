package strategy.main;

import strategy.clase.CardBancar;
import strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(10);
        validator.validareCalatorie();
        validator.setModPlata(new CardBancar());
        validator.validareCalatorie();
    }
}
