package ua.opnu;

public class GenericThreeTuple<T, V, S> {

    public final GenericTwoTuple<T, V> tuple;
    public final S three;

    public GenericThreeTuple(T first, V second, S three) {
        this.tuple = new GenericTwoTuple<>(first, second);
        this.three = three;
    }

    @Override
    public String toString() {
        return "(" + tuple.first + ", " + tuple.second + ", " + three + ")";
    }
}

