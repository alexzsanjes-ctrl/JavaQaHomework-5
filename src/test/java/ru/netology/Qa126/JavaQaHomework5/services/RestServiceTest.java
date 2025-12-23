package ru.netology.Qa126.JavaQaHomework5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Rest.csv")

    public void testCountMonthsRestInYear(int expected, int incoming, int expenses, int threshold) {
        RestService service = new RestService();
        int actual = service.calcMonth(incoming, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
