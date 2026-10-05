import java.util.List;

public interface SortInterface<T extends Comparable<T>> {
    void sort(List<T> numbers);
}
