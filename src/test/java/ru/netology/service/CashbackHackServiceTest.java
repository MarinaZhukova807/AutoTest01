package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService bonus = new CashbackHackService();

    @Test
    public void CashBackNoBonusTest(){
    int actual = bonus.remain(400);
    int expected = 600;
    assertEquals(actual,expected);
    }

    @Test
    public void CashBackOneBonusTest(){
        int actual = bonus.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void CashBackMoreBonusTest(){
        int actual = bonus.remain(1100);
        int expected = 900;
        assertEquals(actual,expected);
    }

}