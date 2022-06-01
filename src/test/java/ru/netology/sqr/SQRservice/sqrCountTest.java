package ru.netology.sqr.SQRservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;


public class sqrCountTest {
    
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/sqrCount.csv")
    void haveSquareInRange(int expected, int lowerLimit, int upperLimit) {
        SQRservice service = new SQRservice();
        int actual = service.sqrCount(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }

    //в заданном диапазоне нет квадратов
//    @Test
//    void dontHaveSquareInRange() {
//        int expected = 0;
//        SQRservice service = new SQRservice();
//        int actual = service.sqrCount(10_000, 30_000);

//        assertEquals(expected, actual);
//    }

    //в заданном диапазоне есть квадраты всех чисал от 10 до 99
//    @Test
//    void allSquareInRange() {
//        int expected = 90;
//        SQRservice service = new SQRservice();
//        int actual = service.sqrCount(10, 10_000);

//        assertEquals(expected, actual);
//    }
}