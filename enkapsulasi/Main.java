package enkapsulasi;

public class Main {
    public static void main(String[] args){
        BankAccount asaryantSabatino=new BankAccount(100);
        asaryantSabatino.withdraw(10);
        System.out.println((asaryantSabatino.getSaldo()));
    }
}
