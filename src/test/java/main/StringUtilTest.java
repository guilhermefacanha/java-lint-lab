package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


class StringUtilTest {

    @Test
    void testIsAdmin() {        assertTrue(StringUtil.isAdmin("admin"), "should be true");
    }
    @Test @Disabled
    void testIsAdminNull() {        assertTrue(StringUtil.isAdmin(null), "should be true");
    }
    @Test
    void testIsNullEmpty() {        assertFalse(StringUtil.isNullOrEmpty("admin"), "should be false");
    }
    @Test
    void testIsNullEmptyWithEmptyString() {
        assertTrue(StringUtil.isNullOrEmpty(""), "should be true");
    }

}
