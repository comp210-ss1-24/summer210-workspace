package ex13.minBinHeap;

public interface Prioritized <V,P extends Comparable<P>> {
    V getValue();
    P getPriority();
}
