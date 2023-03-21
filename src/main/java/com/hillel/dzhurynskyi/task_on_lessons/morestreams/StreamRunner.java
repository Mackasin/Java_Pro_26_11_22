package com.hillel.dzhurynskyi.task_on_lessons.morestreams;


    import java.lang.reflect.Array;
import java.util.Arrays;
    import java.util.List;
    import java.util.OptionalInt;
import java.util.stream.IntStream;

    public class StreamRunner {
        public static void main(String[] args) {
            OptionalInt reduced = IntStream.range(1, 4).reduce((x, y) -> x * y);

            System.out.println(reduced);

            // x = 5 , y = 1
            // x = 5 , y = 2
            // x = 10 , y = 3
            // (((5 * 1) * 2)) * 3
            int reducedTwoParams = IntStream.range(1, 7).reduce(10, (x, y) -> {
                        System.out.println("x " + x + " * y " + y + " = " + (x * y));
                        return x * y;
                    }
            );

            System.out.println(reducedTwoParams);

        }
    }

