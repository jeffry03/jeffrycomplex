package org.program;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SampleProgram {

@BeforeClass
public static void Bclass()
{
System.out.println("Before Class");
}

@AfterClass
public static void Aclass2()
{
System.out.println("After class");
}

@Before
public void Bclass1()
{
System.out.println("Before");
}

@Test
public void Test()
{
System.out.println("Test");
}

@After
public void Aclass() 
{
System.out.println("After");
}
}
