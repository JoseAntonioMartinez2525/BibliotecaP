import java.util.Scanner;

public class Index {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int respuesta;
		Persona autor1=new Persona("Miguel de Cervantes","español", "masculino",68);
		 Persona autor2= new Persona("JK Rowling","inglesa", "femenina",55);
		Libro b1=new Libro("Don Quijote de la Mancha", "1605", 555,autor1, 1);
		Libro b2=new Libro("Harry potter 1", "1998", 255, autor2, 1);

		 int op = 0, librosC = 0, no = 0, imc, usuariosC = 0, prestamosC = 0, tB;
		boolean power=true, t=true;
	    char fechaFinal[]=new char[100];
      
        do {
			menu();
			System.out.println("opcion: ");
			op=in.nextInt();
			switch (op) {
			case 1: menuLibros();
			System.out.println("opcion: ");
			op=in.nextInt();
			switch (op) {

			case 1:
				System.out.println("Consultar autor");
				System.out.println("1.Don quijote 2.Harry Potter");
				respuesta=in.nextInt();
				switch (respuesta) {
				case 1:
					System.out.println(autor1);
					break;
				case 2:
					System.out.println(autor2);
					break;
				default:
					break;
				}
			case 2:System.out.println("Consultar libro");
			System.out.println("1.Don quijote 2.Harry Potter");
			respuesta=in.nextInt();
			switch (respuesta) {
			case 1:
				System.out.println(b1);
				break;
			case 2:
				System.out.println(b2);
				break;
			default:
				break;
			}
				break;
			default:
				break;
			}
				break;
				
			case 2: menuPrestamos();
			System.out.println("opcion: ");
			op=in.nextInt();
				switch (op) {
				case 1:
					System.out.println("Ingese el libro: 1. o 2.");
					respuesta=in.nextInt();
					if(respuesta==1)
						{prestamos(b1);
					b1.setPrestados(1);
					System.out.println(b1.toString());
					
					}
					else {
						prestamos(b2);
						b2.setPrestados(1);
						System.out.println();
						System.out.println(b2.toString());
						
					}
					
					break;
				case 2:
					System.out.println("Ingese el libro: 1. o 2.");
					respuesta=in.nextInt();
					if(respuesta==1)devolucion(b1);else devolucion(b2);
					
					break;
				default:
					break;
				}
				break;
			default: power=false;
				break;
			}
			
		} while (power);
		
		
		
		
	}

	static void menuLibros(){
		   System.out.println("<========= MENU ==============>");
		   System.out.println("<=== 1.- Consultar autor =====>");
		   System.out.println("<=== 2.- Detalles de libro ===>");
		   System.out.println("<=============================>");
		}


	static void menuPrestamos(){
		   System.out.println("<========= MENU =================>");
		   System.out.println("<=== 1.- Realizar prestamo ======>");
		   System.out.println("<=== 2.- Devolver libro =========>");
		   System.out.println("<================================>");
		}

		static void menu(){
		   System.out.println("<========= MENU ================>");
		   System.out.println("<=== 1.- Administrar Libros ====>");
		   System.out.println("<=== 2.- Administrar Prestamos =>");
		   System.out.println("<=== 3.- Salir =================>");
		   System.out.println("<===============================>");
		}

static Persona registrarUsuario(){
    /*Datos del Usuario*/
		Persona	usuario= new Persona();
    
    /*Datos del Usuario*/

    System.out.println("Ingrese el nombre del usuario");
    usuario.setNombres(in.nextLine());

    System.out.println("Nacionalidad del usuario");
    usuario.setNacionalidad(in.nextLine());
    
    System.out.println("Genero del usuario");
    usuario.setGenero(in.nextLine());
   
    System.out.println("Edad del usuario");
    usuario.setEdad(in.nextInt());
    
    
 
    return usuario;
    }
static void prestamos(Libro b) {
	
	if (b.prestamo()) {
        System.out.println("Se ha prestado el libro " + b.getTitulo());
    } else {
        System.out.println("No quedan ejemplares del libro " + b.getTitulo() + " para prestar"); 
      
    }
}
static void devolucion(Libro b) {
	b.setPrestados(1);
	if (b.devolucion()) {
        System.out.println("Se ha devuelto el libro " + b.getTitulo());
    } else {
        System.out.println("No hay ejemplares del libro " + b.getTitulo() + " prestados");
        
    }
}
}
