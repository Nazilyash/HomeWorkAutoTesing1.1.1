package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldTestRemainIfAmountUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int amount=1;
        int actual = service.remain(amount);
        int expected=999;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldTestRemainIfAmountOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount=1001;
        int actual = service.remain(amount);
        int expected=999;
        assertEquals(actual,expected);
    }
    @Test
    public void shouldTestRemainIfAmountEqual1000() {
        CashbackHackService service = new CashbackHackService();
        int amount=1000;
        int actual = service.remain(amount);
        int expected=0;
        assertEquals(actual,expected);
    }
}