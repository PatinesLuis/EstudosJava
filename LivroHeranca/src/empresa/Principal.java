package empresa;

public class Principal {

	public static void main(String[] args) {
		
		
		LivroDigital ld = new LivroDigital("Marvel avengers", new Autor("Tolkien","Alemao","tolkien@gmail.com"),"Aventura", 5,1000,3500);
		
		ld.info();
	}

}
