package Inventory;

public class Wallet {
    private int goldCoin;

    public Wallet(){
        setGoldCoin(0);
    }

    public int getGoldCoin() {
        return goldCoin;
    }

    public void setGoldCoin(int goldCoin) {
        this.goldCoin = goldCoin;
    }

    public boolean spend(int delta){
        if(goldCoin-delta<0)
            return false;
        goldCoin-=delta;
        return true;
    }

    public void receiveGC(int delta){
        if(delta>0)
            goldCoin+=delta;
    }
}
