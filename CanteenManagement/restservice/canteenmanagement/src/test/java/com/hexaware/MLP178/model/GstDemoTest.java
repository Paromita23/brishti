package com.hexaware.MLP178.model;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;


    /**
   * test for Vendors.
   */
public class GstDemoTest {
    /**
   * test for Vendors.
   */
  @Before
  public void initInput() {

  }
   /**
   * test for gstdemo.
   */
  @Test
  public final void testToString() {
    GstDemo gst1 = new GstDemo(1100, 78.75, 78.75, 2);
    String result = String.format("%10s %10s %10s %10s",
        gst1.getVenId(), gst1.getCgst(), gst1.getSgst(), gst1.getMonthNo());
        assertEquals(result,gst1.toString());
  }
  /**
   * Tests the equals/hashcode methods of the Vendors class.
   */
  @Test
  public final void testEquals() {
    GstDemo g = new GstDemo();
    GstDemo gst3 = null;
    GstDemo gst1 = new GstDemo(1100, 78.75, 78.75, 2);
    GstDemo gst2 = new GstDemo(1101, 67.50, 67.50, 2);
    assertTrue(gst1.equals(gst1));
    assertTrue(gst2.equals(gst2));
    assertFalse(gst1.equals(gst3));
    Customer o = null;
    assertFalse(gst1.equals(o));
    Vendor v = new Vendor();
    assertFalse(gst1.equals(v));
    assertFalse(gst1.equals(g));
    assertEquals(gst1.hashCode(), gst1.hashCode());
  }
  /**
   * Tests the equals/hashcode methods of the Vendors class.
   */
  @Test
   public final void testGstDemo() {
    GstDemo g1 = new GstDemo();
    assertNotNull(g1);
    GstDemo gst4 = new GstDemo(1100, 78.75, 78.75, 2);
    assertEquals(1100, gst4.getVenId());
    //assertEquals(78.75, gst4.getCgst());
    //assertEquals(78.75, gst4.getSgst());
    assertEquals(2, gst4.getMonthNo());


    g1.setVenId(1100);
    //g1.setCgst(78.75);
    //g1.setSgst(78.75);
    g1.setMonthNo(2);

    assertEquals(1100, g1.getVenId());
    //assertEquals(78.75, g1.getCgst());
    //assertEquals(78.75, g1.getSgst());
    assertEquals(2, g1.getMonthNo());
  }
}
