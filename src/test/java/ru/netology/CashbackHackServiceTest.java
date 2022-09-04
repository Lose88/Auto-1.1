package ru.netology;

import static org.junit.Assert.*;

import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void showRemainIfAmountBelow1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 700;
        int actual = service.remain(300);
        assertEquals(expected, actual);
    }

    @Test
    public void showRemainIfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @Test
    public void showRemainIfAmountAbove1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 400;
        int actual = service.remain(1600);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void showRemainIfAmountMoreThan1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 400;
        int actual = service.remain(1600);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldfAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void showRemainIfAmountLowThan1000() {
        CashbackHackService service = new CashbackHackService();

        int expected = 700;
        int actual = service.remain(300);
        assertEquals(expected, actual);
    }
}