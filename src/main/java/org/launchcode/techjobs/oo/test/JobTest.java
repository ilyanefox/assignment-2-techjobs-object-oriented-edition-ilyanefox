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

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product Tester", Job.getName());
        assertEquals("ACME", Employer.getValue());
        assertEquals("Desert", Location.getValue());
        assertEquals("Quality Control", PositionType.getValue());
        assertEquals("Persistence", CoreCompetency.getValue());
        assertTrue("Product Tester" instanceof String);
        assertTrue(new Employer("ACME") instanceof Employer);
        assertTrue(new Location("Desert") instanceof Location);
        assertTrue(new PositionType("Quality Control") instanceof PositionType);
        assertTrue(new CoreCompetency("Persistence") instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    }



}
