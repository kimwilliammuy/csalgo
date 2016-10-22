package coins;
public class coins {
public static void main(String[] args) {
double  money = 572.75;
double tenPesoBills = (double) Math.floor (money/10);
money -= tenPesoBills * 10;
double fivePesoCoins = (double) Math.floor(money/5);
money -= fivePesoCoins * 5;
double onePesoCoins = (double) Math.floor(money/1);
money -= onePesoCoins * 1;
double centsCoins = (double) Math.floor(money/0.25);
money -= centsCoins * 0.25;
System.out.println("10 Peso Bills: " + tenPesoBills);
System.out.println("5 Peso Coins: " + fivePesoCoins);
System.out.println("1 Peso Coin: " + onePesoCoins);
System.out.println("25 Cents Coins: " + centsCoins);
}
}
 
