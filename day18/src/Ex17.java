
class Account{
    private int balance = 1000;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int money){
        if(balance >= money){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= money;
        }
    }
}

class Ex17Thread implements Runnable{
    Account account = new Account();

    @Override
    public void run() {
        while(account.getBalance() > 0){
            // 100, 200, 300 中 임의의 금액 인출하기
            int money = ((int) (Math.random()*3) + 1) *100;
            System.out.println(Thread.currentThread().getName() + " : " + money);
            account.withdraw(money);
            System.out.println(Thread.currentThread().getName() + " balance : " + account.getBalance());
        }
    }
}

public class Ex17 {
    public static void main(String[] args){
        Runnable runnable = new Ex17Thread();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        //각각의 다른 call stack 에서 같은 스레드 실행..
        thread1.start();
        thread2.start();
    }
}
