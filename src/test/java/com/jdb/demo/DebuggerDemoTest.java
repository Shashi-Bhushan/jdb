package com.jdb.demo;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Shashi on 13/11/15.
 */
public class DebuggerDemoTest {

    private static DebuggerDemo debuggerDemo;

    private static final String DUMMY_NAME = "DUMMY_NAME";

    @BeforeClass
    public static void setUp(){
        debuggerDemo = new DebuggerDemo().setName(DUMMY_NAME);
    }

    @Test
    public void testPrintName_printsName_namePrinted(){
        debuggerDemo.printName();
    }

    @Test
    public void testSetName_setNewName_returnsNewName(){
        assertTrue( "Shashi".equals(debuggerDemo
                .setName("Shashi").getName()
        ) );
    }
}
