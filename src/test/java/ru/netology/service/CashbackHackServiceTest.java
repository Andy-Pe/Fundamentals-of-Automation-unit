package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void remainJupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void ifBuyOn1() {
        int amount = 1;
        int expected = 999;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void ifBuyOn1Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(expected, actual);
    }

    @Test
    public void ifBuyOn999() {
        int amount = 999;
        int expected = 1;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void ifBuyOn999Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }

    @Test
    public void ifBuyOn1000() {
        int amount = 1000;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void ifBuyOn1000Jupiter() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }
}
