import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HeighestSpendDay {
    public static void main(String args []) {

        List<Transactions> transactions = Arrays.asList(
                new Transactions("T1", LocalDate.of(2024,1,1),300),
                new Transactions("T2", LocalDate.of(2024,1,1), 200),
                new Transactions("T3", LocalDate.of(2024,1,2), 500),
                new Transactions("T4", LocalDate.of(2024,1,2), 300),
                new Transactions("T5", LocalDate.of(2024,1,3), 100)
        );

        Map.Entry<LocalDate, Double> localDateDoubleEntry = transactions.stream()
                .collect(Collectors.groupingBy(
                        Transactions::getDate,
                        Collectors.summingDouble(Transactions::getAmount)
                )).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println(localDateDoubleEntry);
    }
}
