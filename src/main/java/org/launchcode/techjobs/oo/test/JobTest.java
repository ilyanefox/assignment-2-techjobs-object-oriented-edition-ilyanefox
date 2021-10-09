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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String jobString = job.toString();
        String expected = "\nID: " + job.getId() + "\n" + "Name: " + job.getName() + "\n" + "Employer: " + job.getEmployer() + "\n" +
                "Location: " + job.getLocation() + "\n" + "Position Type: " + job.getPositionType() + "\n" + "Core Competency: " + job.getCoreCompetency() + "\n";
        assertEquals(expected.charAt(0), jobString.charAt(0));
        //assertTrue(jobString.startsWith("\n"));
        assertEquals(expected.charAt(expected.length() - 1), jobString.charAt(jobString.length() - 1));
        //assertTrue(jobString.endsWith("\n"));
        assertEquals(jobString, job.toString());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        String expected = "\nID: " + job.getId() + "\n" + "Name: " + job.getName() + "\n" + "Employer: " + job.getEmployer() + "\n" +
                "Location: " + job.getLocation() + "\n" + "Position Type: " + job.getPositionType() + "\n" + "Core Competency: " + job.getCoreCompetency() + "\n";

        assertEquals(expected, job.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        job.getEmployer().setValue("");
        String expected = "\nID: " + job.getId() + "\n" + "Name: " + job.getName() + "\n" + "Employer: " + "Data not available" + "\n" +
                "Location: " + job.getLocation() + "\n" + "Position Type: " + job.getPositionType() + "\n" + "Core Competency: " + job.getCoreCompetency() + "\n";

       assertEquals(expected, job.toString());
    }
}