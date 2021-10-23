public class WonPayoutStrategy implements PayoutStrategy {
    @Override
    public void payout(Chips chips) {
        chips.deposit(bet * 2);
    }
}
