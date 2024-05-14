public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }


    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros(), this.cents + addition.cents);
    }

    public boolean lessThan(Money compared) {
        int currentCents = (this.euros * 100) + this.cents;
        int comparedCents = (compared.euros * 100) + compared.cents;

        return (currentCents < comparedCents);
    }

    public Money minus(Money decreaser) {
        int capitalCents = (this.euros * 100) + this.cents;
        int expenseCents = (decreaser.euros * 100) + decreaser.cents;

        int difference = capitalCents - expenseCents;

        if (difference < 0) {
            return new Money(0, 0);
        }

        int currentEuros = difference / 100;
        int currentCents = difference % 100;


        return new Money(currentEuros, currentCents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
}
