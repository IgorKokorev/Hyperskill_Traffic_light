import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<? extends T> list = stream.sorted(order).toList();

        if (list.size() == 0) {
            minMaxConsumer.accept(null, null);
        }
        else {
            minMaxConsumer.accept(
                    list.get(0),
                    list.get(list.size() - 1)
            );
        }
        // your implementation here
    }
}