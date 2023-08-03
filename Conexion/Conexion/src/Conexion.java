import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Conexion {

    Scanner sc = new Scanner(System.in);

    String bd, user, pass,
    url = "jdbc:mysql://localhost:3306/",
    driver = "com.mysql.cj.jdbc.Driver"; 

    int ans;

    Connection con;
    
    Conexion(String bd, String user, String pass){
        this.bd = bd;
        this.user = user;
        this.pass = pass;
    }

    public Connection conectar(){
    
            try {
                con = DriverManager.getConnection(url, user, pass);
                System.out.println("Estas conectado\n ¿Quieres crear una base de datos? Sí(1) No(0)");

                Statement s = con.createStatement();

                ans = sc.nextInt();

                if (ans == 1) {
                    s.execute("DROP DATABASE IF EXISTS tienda");

                    s.execute("CREATE DATABASE tienda;");

                    s.execute("USE tienda");

                    s.execute("CREATE TABLE fabricantes (id INT PRIMARY KEY, nombre VARCHAR(100))");

                    s.execute("CREATE TABLE productos (id INT PRIMARY KEY, nombre VARCHAR(100), precio DOUBLE,id_fabricante  INT, FOREIGN KEY (id_fabricante) REFERENCES fabricantes(id))");

                    s.execute("INSERT INTO fabricantes VALUES(1, 'Asus'), (2, 'Lenovo'), (3, 'Hewlett-Packard'), (4, 'Samsung'), (5, 'Seagate'), (6, 'Crucial'), (7, 'Gigabyte'), (8, 'Huawei'), (9, 'Xiaomi')");

                    s.execute("INSERT INTO productos VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5), (2, 'Memoria RAM DDR4 8GB', 120, 6), (3, 'Disco SSD 1 TB', 150.99, 4), (4, 'GeForce GTX 1050Ti', 185, 7), (5, 'GeForce GTX 1080 Xtreme', 755, 6), (6, 'Monitor 24 LED Full HD', 202, 1), (7, 'Monitor 27 LED Full HD', 245.99, 1), (8, 'Portatil Yoga 520', 559, 2), (9, 'Portatil Ideapd 320', 444, 2), (10, 'Impresora HP Deskjet 3720', 59.99, 3), (11, 'Impresora HP Laserjet Pro M26nw', 180, 3)");

                    ResultSet r = s.executeQuery("SELECT * FROM fabricantes");

                    System.out.println("Tabla Fabricantes");
                    while (r.next()) {
                        String id, nombre;

                        id = r.getString("id");
                        nombre = r.getString("nombre");

                        System.out.println(id + " " + nombre);
                    }

                    r = s.executeQuery("SELECT * FROM productos");

                    System.out.println("\n\nTabla Productos");
                    while (r.next()) {
                        String id, nombre, precio, id_fabricante;

                        id = r.getString("id");
                        nombre = r.getString("nombre");
                        precio = r.getString("precio");
                        id_fabricante = r.getString("id_fabricante");

                        System.out.println(id + " " + nombre + " " + precio + " " + id_fabricante);
                    }

                } else {
                   System.out.println("Gracias"); 
                }
                
            } catch (SQLException e) {
                System.out.println("No jala esa madre\n" + e);
            }
            
            
        
        return con;
    }

    public static void main(String[] args) {
        Conexion conecta = new Conexion("", "root", "03052003");
        conecta.conectar();
    }
}


