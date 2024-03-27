package cs230.ci;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import cs230.ci.entities.AssignmentTest;
import cs230.ci.entities.UserTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({AssignmentTest.class, UserTest.class})
public class AllTests {

}
