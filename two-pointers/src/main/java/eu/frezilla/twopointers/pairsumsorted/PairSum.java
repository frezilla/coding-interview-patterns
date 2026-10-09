package eu.frezilla.twopointers.pairsumsorted;

public final class PairSum {

    private final int value1;
    private final int value2;

    public PairSum(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.value1 + this.value2);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PairSum other = (PairSum) obj;
        return ((other.value1 == this.value1 && other.value2 == this.value2)
                || (other.value1 == this.value2 && other.value2 == this.value1));
    }

}
