public class Chips {

    public static void main( String[] args )
    {
        Chips chips = Game.getBet();
        PayoutContext ctx = null;
        ctx = new PayoutContext();
        if( "won".equals(this.gamestate.checkStatus())
        {
            ctx.setPayoutStrategy(new WonPayoutStrategy());
        }
        ctx.payout(chips);
}
}
