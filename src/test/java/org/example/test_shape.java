package org.example;

import org.junit.jupiter.api.Test;

public class test_shape {
    @Test
    void assertAreaComputation() {
        shape shape = new rectangle();
        assert shape.computeArea().equals(4);
    }

    @Test
    void assertRectangularAreaComputation() {
        shape shape = new rectangle(6, 7);
        assert shape.computeArea().equals(42);
    }

    @Test
    void assertSquareAreaComputation() {
        shape shape = new square(7);
        assert shape.computeArea().equals(49);
    }
}
