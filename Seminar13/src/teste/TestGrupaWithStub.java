package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.IStudent;
import dubluri.StudentDummy;
import dubluri.StudentStub;

public class TestGrupaWithStub {
	
	Grupa grupa;

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitate() {
		IStudent student = new StudentStub();
		grupa = new Grupa(1076);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
