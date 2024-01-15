package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00To20Then2() {
        double expected = 2.0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00To31Then3dot16() {
        double expected = 3.16;
        Point a = new Point(0, 0);
        Point b = new Point(3, 1);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when00To42Then4dot47() {
        double expected = 4.47;
        Point a = new Point(0, 0);
        Point b = new Point(4, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12To42Then3() {
        double expected = 3;
        Point a = new Point(1, 2);
        Point b = new Point(4, 2);
        double out = a.distance(b);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123To456Then5dot19() {
        double expected = 5.19;
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);
        double out = point1.distance3d(point2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }
}