public class Key {
    private final String stock;
    private final int dayOfYear;
    public Key(String s, int d){
        stock = s;
        dayOfYear = d;
    }
    public int hash(){
        int hash = dayOfYear;
        for(int i = 0; i < stock.length(); i++) hash += stock.charAt(i) * 3;
        return hash;
    }
    public boolean eq(Key that){
        return that.dayOfYear == dayOfYear && that.stock.equals(stock);
    }
}
