package example;

/*

1. Оставить только нечетные числа
2. разделить на 3 числа, которые можно разделить без остатка
3. Найти сумму оставшихся измененных чисел
 */

import java.util.Arrays;

public class Task1 {

    public static int tryDoingExs(int[] arr) {
        return Arrays.stream(arr)
                .filter(e -> e % 2 != 0)
                .map(e -> {
                    if (e % 3 == 0) {
                        e = e / 3;
                    }
                    return e;
                })
                .reduce((a, e) -> a + e).getAsInt();
    }
}
