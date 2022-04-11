package strategy.clase;

public class Sms implements ModPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("Plata in valoare de "+suma+" a fost efectuata prin SMS");
    }
}
