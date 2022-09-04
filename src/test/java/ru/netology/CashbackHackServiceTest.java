package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void showRemainIfAmountBelow1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 700;
        int actual = service.remain(300);
        assertEquals(actual, expected);
    }

    @Test
    public void showRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void showRemainIfAmountAbove1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(1600);
        assertEquals(actual, expected);
    }
}