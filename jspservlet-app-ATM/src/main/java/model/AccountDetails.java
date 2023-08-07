package model;

public class AccountDetails{
	private String accountType;
    private double withdrawOrDepositAmount;
    private double availableBalance;
    private int pin;

    public AccountDetails(String accType, double wod, double availBal, int pin) {
        this.accountType = accType;
        this.withdrawOrDepositAmount = wod;
        this.availableBalance = availBal;
        this.pin = pin;
    }

    public getAccountType() {
        return this.accountType;
    }

    public setAccountType(String accType) {
        this.accountType = accType;
    }

    public getWOD() {
        return this.withdrawOrDepositAmount;
    }

    public setWOD(double value) {
        this.withdrawOrDepositAmount = value;
    }

    public getAvailBal() {
        return this.availableBalance;
    }

    public setAvailBal(double bal) {
        this.availableBalance = bal;
    }

    public getPin() {
        return this.pin;
    }

    public setPin(int pin) {
        this.pin = pin;
    }
}
