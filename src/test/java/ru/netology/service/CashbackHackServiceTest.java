package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldTestRemainIfAmountUnder1000() {
        CashbackHackService service = new CashbackHackService();
        int amount=1;
        int actual = service.remain(amount);
        int expected=999;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldTestRemainIfAmountOver1000() {
        CashbackHackService service = new CashbackHackService();
        int amount=1001;
        int actual = service.remain(amount);
        int expected=999;
        assertEquals(expected,actual);
    }
    @Test
    public void shouldTestRemainIfAmountEqual1000() {
        CashbackHackService service = new CashbackHackService();
        int amount=1000;
        int actual = service.remain(amount);
        int expected=0;
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldTestRemainIfAmountUnder1000Api() {
        CashbackHackService service = new CashbackHackService();
        int amount=1;
        int actual = service.remain(amount);
        int expected=999;
        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void shouldTestRemainIfAmountOver1000Api() {
        CashbackHackService service = new CashbackHackService();
        int amount=1001;
        int actual = service.remain(amount);
        int expected=999;
        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }
    @org.junit.jupiter.api.Test
    public void shouldTestRemainIfAmountEqual1000Api() {
        CashbackHackService service = new CashbackHackService();
        int amount=1000;
        int actual = service.remain(amount);
        int expected=0;
        org.junit.jupiter.api.Assertions.assertEquals(expected,actual);
    }

}