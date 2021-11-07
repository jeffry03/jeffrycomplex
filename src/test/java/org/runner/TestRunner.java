package org.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.program.ProgramComplex;

import utils.base;


@RunWith(Suite.class)
@SuiteClasses({ProgramComplex.class,base.class})
public class TestRunner {

}
