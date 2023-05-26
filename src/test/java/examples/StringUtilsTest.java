package examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringUtilsTest {
    private StringUtils utils;

    @BeforeEach
    void setUp(){
        utils = new StringUtils();
    }

    @Test
    void isPositiveNumberAssertTrue() {
        assertTrue(utils.isPositiveNumber("4"));
    }

    @Test
    void isPositiveNumberAssertFalse() {
        assertFalse(utils.isPositiveNumber("-1"));
    }

    @Test
    void isPositiveNumberAssertArgumentNull() {
        assertThatThrownBy(() -> utils.isPositiveNumber(null))
                .isInstanceOf(NullPointerException.class);
    }

    @Test
    void isPositiveNumberAssertException() {
        assertThatThrownBy(() -> utils.isPositiveNumber("asdf"))
                .isInstanceOf(NumberFormatException.class);
    }
}