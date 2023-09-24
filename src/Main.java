public class Main {
    public static void main(String [] args) {
       int currentAccount=100; //текущая сумма на счету
        int replenishment=1200; //сумма пополнения

        int bonus;
        if(replenishment>1000){
            bonus = replenishment/100;
        } else {
            bonus = 0;
        }
        System.out.println(currentAccount + replenishment + bonus);
    }
}