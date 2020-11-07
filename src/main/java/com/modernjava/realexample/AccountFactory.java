package com.modernjava.realexample;

public interface AccountFactory {
    BankAccount getBankAccount(int id, double balance, String accountName);
}
