package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametru() {
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(3);
		student.adaugaNota(10);
		assertTrue("Studentul care are restanta e marcat ca neavand restanta", student.areRestante());
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(7);
		student.adaugaNota(10);
		assertFalse("Studentul care nu are restanta e marcat ca avand restanta", student.areRestante());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(7);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testAdaugaNotaCorecta() {
		Student student = new Student();
		int nota = 7;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}

}
