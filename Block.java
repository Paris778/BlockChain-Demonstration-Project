import java.util.Arrays;

public class Block {

    // Variables 
    private String[] transactions;
    private int blockHash;
    private int prevBlockHash;
    
    // Constructor
    public Block(String[] transactions, int prevBlockHash) {
        this.transactions = transactions;
        this.prevBlockHash = prevBlockHash;
        this.blockHash = Arrays.hashCode(new int[] {Arrays.hashCode(transactions), this.prevBlockHash});
    }

    // To String Method 
    @Override
    public String toString() {
        return "Block [blockHash=" + blockHash + ", prevBlockHash=" + prevBlockHash + ", transactions=" + Arrays.toString(transactions) + "]";
    }
    

    // Getters and Setters
    public String[] getTransactions() {
        return transactions;
    }

    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }

    public int getPrevBlockHash() {
        return prevBlockHash;
    }

    public void setPrevBlockHash(int prevBlockHash) {
        this.prevBlockHash = prevBlockHash;
    }

    
}
