package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(1, "Arthur", "arthur@gmail.com", sdf.parse("17/03/1989"), 12.000, obj);
		System.out.println(seller);
		
	}

}
