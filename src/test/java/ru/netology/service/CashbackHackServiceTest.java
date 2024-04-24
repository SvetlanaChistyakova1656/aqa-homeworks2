package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackHackServiceTest {

    @Test
    public void calculateCashBack1 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack2 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack3 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 1600;

        int actual = service.remain(amount);
        int expected = 400;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void calculateCashBack4 () {
        CashbackHackService service = new CashbackHackService();

        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}