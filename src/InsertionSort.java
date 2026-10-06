import java.util.List;

public class InsertionSort implements Sorting<Integer> {

    public void sort(List<Integer> numbers){
        int n = numbers.size();

        for(int i = 1; i < n; i++){
            int j = i;

            while (j > 0 && numbers.get(j - 1) > numbers.get(j)){
                int _this = numbers.get(j);
                numbers.set(j, numbers.get(j - 1));
                numbers.set(j - 1, _this);
                j--;
            }
        }
    }
}
