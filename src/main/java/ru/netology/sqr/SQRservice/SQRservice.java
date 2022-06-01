package ru.netology.sqr.SQRservice;

public class SQRservice {

    public int sqrCount(int lowerLimit, int upperLimit) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i <= upperLimit) {
                if (i * i >= lowerLimit) {
                    count = count + 1;
                }
            } else {
                break;
            }
        }
        return count;
    }
}