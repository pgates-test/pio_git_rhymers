package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int FULL = 11;
    private int[] NUMBERS = new int[MAX_SIZE];

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getFULL() {
        return FULL;
    }

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == EMPTY;
        }
        
            public boolean isFull() {
                return total == FULL;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return EMPTY;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return EMPTY;
                        return NUMBERS[total--];
                    }


}
