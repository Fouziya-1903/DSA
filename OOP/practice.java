public class practice {
    public static class BankAccount{
        private double balance;
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("The available balance is: " + balance);
            } else {
                System.out.println("Invalid deposit amount");
            }
        }

        public void withdraw(double amount){
            if(balance >= amount){
                balance = balance - amount;
                System.out.println("The available balance is: " + balance);
            }else{
                System.out.println("Insufficient funds");
            }
        }
    }
}
