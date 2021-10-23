public class PayoutContext {
    private PayoutStrategy payoutStrategy;

    public void setPayoutStrategy(PayoutStrategy strategy)
    {
        this.payoutStrategy = strategy;
    }

    public PayoutStrategy getPayoutStrategy()
    {
        return payoutStrategy;
    }

    public void payout(Chips chips)
    {
        payoutStrategy.payout(chips);
    }
}
