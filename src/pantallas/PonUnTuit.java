package pantallas;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import selenium.CuatroEnUno;
import selenium.DAO;



public class PonUnTuit {
	
	public static void alta(String QueNavegador) throws SQLException, Exception {
		
		String debug = "Incertidumbre cuántica";
		String queTest = "Pon un tuit";
		int resulTest=2;
		
		try{ 
			
		
			
			
			
			
			
			
			
			
			
			
			debug = "Test OK";
			
			
			
		} catch (Exception e){
			debug = e.getMessage();
			System.out.print(debug);
		} finally {
			DAO.defineConnection("jdbc:mysql://localhost:3306/","root","");
			if (debug == "Test OK") {
				resulTest = 1;
						} else {
							resulTest = 0;
						}
			DAO.insertaTrazaTest(queTest,QueNavegador,debug,resulTest);
			
			DAO.closeConnection();
		}
			
		
			
	}//Fin ponerTuit

}//Fin PonUnTuit
