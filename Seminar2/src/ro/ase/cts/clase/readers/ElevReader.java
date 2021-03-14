package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

public class ElevReader extends Reader {

	public ElevReader(String filename) {
		super(filename);
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input = new Scanner(new File(super.filename));
		input.useDelimiter(",|\n");
		List<Aplicant> elevi = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Elev elev = new Elev();
			super.readAplicant(elev, input);
			int clasa = input.nextInt();
			String tutore = input.next();
			elev.setClasa(clasa);
			elev.setTutore(tutore);
			elevi.add(elev);
		}

		input.close();
		return elevi;
	}

}
