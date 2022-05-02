package template.main;

import template.clase.MijlocTransportPeSine;
import template.clase.Tramvai;

public class Main {
    public static void main(String[] args) {
        MijlocTransportPeSine tramvai = new Tramvai();
        tramvai.parcurgereTraseu();
        System.out.println();
        tramvai.parcurgereTraseuInvers();
    }
}
