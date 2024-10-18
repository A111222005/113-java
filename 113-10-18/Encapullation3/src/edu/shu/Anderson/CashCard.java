package edu.shu.Anderson;

public class CashCard {
    private String number;
    private int balance;
    private int bonus;

    public CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void store(int money) {
        if (money > 0) {
            this.balance += money;
            if (money >= 1000) {
                this.balance += money / 1000;
            }
        } else {
            System.out.println("儲值金額為負，來亂的!");
        }
    }


    public void charge(int money){
        if(money > 0){
            if(money <= this.balance){
                this.balance -= money;
            }
            else {
                System.out.println("餘額不足，可憐啊");
            }
        }
        else {
            System.out.println("扣除金額為負，來亂的");
        }
    }

    int exchange(int bonus){
        if(bonus > 0){
            this.bonus -= bonus;
        }
        return this.bonus;
    }
}
