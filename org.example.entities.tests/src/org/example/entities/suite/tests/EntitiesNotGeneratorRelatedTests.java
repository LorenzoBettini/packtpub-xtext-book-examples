package org.example.entities.suite.tests;

import org.example.entities.tests.EntitiesFormatterTest;
import org.example.entities.tests.EntitiesParserTest;
import org.example.entities.tests.EntitiesValidatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    EntitiesParserTest.class,
    EntitiesFormatterTest.class,
    EntitiesValidatorTest.class
})
public class EntitiesNotGeneratorRelatedTests {

}
