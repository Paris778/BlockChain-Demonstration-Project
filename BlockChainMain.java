import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainMain{ 

    public static void main(String [ ] args){

        // Demonstrate a hash 
        String state = "Hello Blockchain";
        int hashValue = state.hashCode();

        System.out.println("Statemenet: " + state + " Code: " + hashValue);

        // Hash an array

        String [] list = {"alex", "bob", "cynthia"};
        String [] list2 = {"alex", "bob", "cynthia"};

        int hashArr1 = Arrays.hashCode(list);
        int hashArr2 = Arrays.hashCode(list2);

        System.out.println("Hash 1 : " + hashArr1 + " Hash 2 : " + hashArr2);

        // Demonstrate series of Blocks in a chain 
        ArrayList<Block> blockChain = new ArrayList<Block>();

        String [] initialValues = {"Shad has $70 ", "Sam has $110", "Caren has $50"};
        Block firstBLock = new Block(initialValues, 0);
        blockChain.add(firstBLock);

        System.out.println("First block is : " + firstBLock.toString());
        System.out.println("Full block chain is : " + blockChain.toString());

        // Block Two 
        String [] ShadGives = {"Shad gives Sam $20" , "Shad gives Ceren $35"};
        Block secondBlock = new Block(ShadGives, firstBLock.getBlockHash());
        blockChain.add(secondBlock);
        System.out.println("Second Block is : " + secondBlock.toString());
        System.out.println("Full block chain is : " + blockChain.toString());

        
        // Block Three 
        String [] peopleGet = {"Peter gives Sam $20" , "Derek gives Shad $35"};
        Block thirdBlock = new Block(peopleGet, secondBlock.getBlockHash());
        blockChain.add(thirdBlock);
        System.out.println("Third Block is : " + thirdBlock.toString());
        System.out.println("Full block chain is : " + blockChain.toString());

    }
}