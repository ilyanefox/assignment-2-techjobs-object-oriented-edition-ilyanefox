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
        assertEquals("Product Tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality Control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
        assertTrue("Product Tester" instanceof String);
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job(001, "Product Tester", new Employer("ACME"));
        Job job2 = new Job(015, "Product Tester", new Employer("ACME"));
        assertFalse(job1.equals(job2));
    }

    //When passed a Job object, it should return a string that contains a blank line before and after the job information.
    //
    //The string should contain a label for each field, followed by the data stored in that field. Each field should be on its own line.
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String expected = "\nID: " + job.getId() + "\n" + "Name: " + job.getName() + "\n" + "Employer: " + "\n" +
                "Location: " + job.getLocation() + "\n" + "Position Type: " + job.getPositionType()+ "\n" + "Core Competency: " + job.getCoreCompetency() + "\n";
        assertEquals(jobString.charAt(0), "\n");
        assertEquals(jobString.charAt(jobString.length() -1), "\n");

    }


}
