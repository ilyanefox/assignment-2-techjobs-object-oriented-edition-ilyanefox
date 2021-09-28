package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job jobA = new Job();
        Job jobB = new Job();
        assertNotEquals(jobA, jobB);
    }

//    @Test
//    public void testJobConstructorSetsAllFields() {
//        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//        assertEquals("Product Tester", job.getName());
//        assertEquals("ACME", job.getEmployer());
//        assertEquals("Desert", job.getLocation());
//        assertEquals("Quality Control", job.getPositionType());
//        assertEquals("Persistence", job.getCoreCompetency());



  //  }

}
