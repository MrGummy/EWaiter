package model;

import com.model.WaiterComment;
import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class WaiterCommentTest {
    /**
     * Тест создания WaiterComment.
     */
    @Test
    public void testCreateWaiterComment() {
        System.out.println("test WaiterComment createWaiterComment");
        Timestamp dateTime = new Timestamp(2018, 3, 23, 12, 35, 56, 23);
        WaiterComment waiterComment = new WaiterComment(1, "comment", dateTime, 1);
        assertEquals(waiterComment.getId(), 1);
        assertEquals(waiterComment.getComment(), "comment");
        assertEquals(waiterComment.getDateTime(), dateTime);
        assertEquals(waiterComment.getWaiterId(), 1);

        waiterComment.setId(2);
        assertEquals(waiterComment.getId(), 2);

        waiterComment.setComment("comment2");
        assertEquals(waiterComment.getComment(), "comment2");

        Timestamp dateTime2 = new Timestamp(2018, 6, 14, 16, 2, 43, 11);
        waiterComment.setDateTime(dateTime2);
        assertEquals(waiterComment.getDateTime(), dateTime2);

        waiterComment.setWaiterId(2);
        assertEquals(waiterComment.getWaiterId(), 2);
    }

    /**
     * Тест проверки равенства/неравенства WaiterComment.
     */
    @Test
    public void testEquals() {
        Timestamp dateTime = new Timestamp(2018, 3, 23, 12, 35, 56, 23);
        Timestamp dateTime2 = new Timestamp(2018, 6, 14, 16, 2, 43, 11);
        System.out.println("test WaiterComment equals");
        WaiterComment waiterComment1 = new WaiterComment(1, "comment", dateTime, 1);
        WaiterComment waiterComment2 = new WaiterComment(1, "comment", dateTime, 1);
        WaiterComment waiterComment3 = new WaiterComment(2, "comment2", dateTime2, 2);

        assertTrue( waiterComment1.equals(waiterComment2)   );
        assertFalse(waiterComment1.equals(waiterComment3)   );
    }
}
