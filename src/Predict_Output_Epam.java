import java.util.stream.Stream;

/**
 * Demonstrates the lazy evaluation behavior of Java Streams.
 *
 * <p>This class illustrates an important concept in Stream API: intermediate operations
 * like {@link Stream#filter(java.util.function.Predicate)} are not executed
 * until a terminal operation is invoked on the stream.
 * </p>
 *
 * <p>In this example, although a filter operation is defined, it will never be executed
 * because no terminal operation (such as {@code collect()}, {@code forEach()}, or {@code count()})
 * is called on the stream. Therefore, the counter will remain 0.
 * </p>
 *
 * @author Programming Practice
 * @version 1.0
 */
public class Predict_Output_Epam {

    /**
     * Main method that demonstrates lazy evaluation in Streams.
     *
     * <p>Creates a stream of three strings and applies a filter operation that:
     * <ul>
     *   <li>Increments the counter array by 1 for each element evaluated</li>
     *   <li>Returns true only for strings starting with "a"</li>
     * </ul>
     * </p>
     *
     * <p><b>Expected Output:</b> {@code Counter :0}
     * </p>
     *
     * <p>The counter remains 0 because the filter operation is an intermediate operation
     * that is not executed without a terminal operation on the stream.
     * </p>
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String args []){
        int [] counter = {0};
        Stream.of("apple","banana","cherry").filter( s -> {
            counter[0]++;
            return s.startsWith("a");
        });
        System.out.println("Counter :" + counter[0]);
    }
}
