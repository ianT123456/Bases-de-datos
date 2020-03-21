package cuarentena;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Conector instancia = Conector.getInstancia();
		try {
			instancia.getPacientesNombres();
			instancia.getDoctoresInformacion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}