package org.webinar.sample;


import javax.security.auth.login.AccountException;

public class Util {

    public static void transferMoney(Account fromAccount, Account toAccount, DollarAmount amount) {
        synchronized (fromAccount) {
            synchronized (toAccount) {
                    fromAccount.debit(amount);
                    toAccount.credit(amount);

            }
        }

    }

}
