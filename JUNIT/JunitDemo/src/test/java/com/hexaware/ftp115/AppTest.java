package com.hexaware.ftp115;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;



import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testHello(){
        assertEquals("Welcome to JUNIT", App.sayHello());
    }
    @Test
    public void testsum(){
        assertEquals(5, App.sum(2,3));
    }

    @Test
    public void testmax(){
        assertEquals(5, App.max(5,2,3));
        assertEquals(5, App.max(2,5,3));
        assertEquals(5, App.max(2,3,5));
    }

    @Test 
    public void minArraytest(){
        assertEquals(2, App.minArray(new int []{2,3,4}));
        assertEquals(-3, App.minArray(new int []{2,-3,4}));
    }

    @Test 
    public void booleantest(){
            assertTrue(App.even(2));
            assertFalse(App.even(11));
    }

    @Test
    public void testEmp(){
        Employ e1 = null;
        assertNull(e1);
        Employ e2 = new Employ ();
        assertNotNull(e2);
        Employ e3 = new Employ(3, "Akash", 15423.0);
        assertEquals(3, e3.getEmpno());
        assertEquals("Akash", e3.getName());
        assertEquals(15423.0, e3.getBasic(),0);
        e2.setEmpno(12);
        e2.setName("omkar");
        e2.setBasic(2552.2);
        assertEquals(12,e2.getEmpno());
        assertEquals("omkar",e2.getName());
        assertEquals(2552.2,e2.getBasic(),0);
        Employ emp1 = new Employ(5,"Bhuvana", 62211.0);
        Employ emp2 = new Employ(5,"Bhuvana", 62211);
        assertEquals(emp1.hashCode(),emp2.hashCode());
        String res1 = "Empno 5 Name Bhuvana Basic 62211.0";
        assertEquals(res1,emp1.toString());
    }

    @Test 
    public void testStudent(){
        Student s1 = null;
        assertNull(s1);
        Student s2 = new Student();
        assertNotNull(s2);
        Student s3 = new Student(1, "Akash", "banglore", 8.0);
        assertEquals(1, s3.getSno());
        assertEquals("Akash", s3.getSname());
        assertEquals("banglore", s3.getCity());
        assertEquals(8.0, s3.getCgp(),0);
        s2.setSno(12);
        s2.setName("omkar");
        s2.setCity("pune");
        s2.setCgp(8.0);
        assertEquals(12,s2.getSno());
        assertEquals("omkar",s2.getSname());
        assertEquals("pune",s2.getCity());
        assertEquals(8.0,s2.getCgp(),0);
        Student stu1 = new Student(2,"nikita","pune", 6.0);
        Student stu2 = new Student(2,"nikita","pune",6.0);
        assertEquals(stu1.hashCode(),stu2.hashCode());
        assertEquals(stu1, stu2);
        String res1 = "sno 2 name nikita city pune cgp 6.0";
        assertEquals(res1,stu1.toString());
    }

}
