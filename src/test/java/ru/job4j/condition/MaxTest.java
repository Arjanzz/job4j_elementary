package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To1Then2() {
        int left = 2;
        int right = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLAndREqualThenRandom() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft2AndRight3AndTop5Then5() {
        int left = 2;
        int right = 3;
        int top = 5;
        int result = Max.max(left, right, top);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenLeft3AndRight3AndTop5AndBottom7Then7() {
        int left = 2;
        int right = 3;
        int top = 5;
        int bottom = 7;
        int result = Max.max(left, right, top, bottom);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}