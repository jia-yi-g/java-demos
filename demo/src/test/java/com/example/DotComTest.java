package com.example;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.*;
import junitparams.JUnitParamsRunner;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.BeforeClass;
import org.junit.Before;
/**
 * Unit test for simple App.
 */

@RunWith(Parameterized.class)
public class DotComTest
{
    private String type;
    private String input;
    private String expected;
    static ArrayList<String> locations=new ArrayList<String>();
    static String[] list ={"C1","E1","D1"};
    DotCom dotTester=new DotCom();

    public DotComTest(String type,String input,String expected){
        this.type=type;
        this.input=input;
        this.expected=expected;
    }
    
    @BeforeClass
    public static void setUpBeforeClass() {
        int i;
        i=0;
        while(i<list.length){
            locations.add(list[i]);
        }
    }
    
    @Before 
    public void setUp() {
        dotTester.setLocationCells(locations);
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"locations","",""},{"name","1.com","1.com"},{"name","2.com","2.com"},
            {"check","C1","hit"},{"check","D1","hit"},{"check","E1","hit"},{"check","E2","miss"}
        });
    }
      @Test
    public void setLocationCellsTest()
    {   if(type.equals("location")){

        ArrayList<String> locationTest=dotTester.getLocationCells();
        assertEquals(locations,locationTest);
       
    }
    }
    @Test
    public void setNameTest() {
        if(type=="name"){

            dotTester.setName(input);
            assertEquals(expected,dotTester.getName());
        }
    }
    @Test 
    public void checkYourselfTest(){
        if(type=="check"){

            String result;
            result=dotTester.checkYourself(input);
            locations.remove(input);
            assertEquals(expected,result);
        }
    }


}
