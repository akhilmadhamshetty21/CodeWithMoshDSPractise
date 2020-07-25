import java.time.Month;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestJava {
	public static void main(String[] args) {
		System.out.println(Stream.of("1red","2red","3red").anyMatch(s->{System.out.println(s);return s.startsWith("1");}));
	}
	
	
}
