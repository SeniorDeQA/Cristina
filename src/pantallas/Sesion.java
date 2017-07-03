package pantallas;

import java.sql.SQLException;
import org.openqa.selenium.By;

import selenium.CuatroEnUno;
import selenium.DAO;



public class Sesion {
	
	public static void login(String QueNavegador, String IP_SERVIDOR) throws SQLException, Exception {
		
		String debug = "Incertidumbre cuántica";
		String queTest = "Login";
		int resulTest=2;
		
		try{ 
			
			CuatroEnUno.driver.manage().window().maximize();

			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div/div[2]/form/div[1]/input")).sendKeys("45816433L");
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("*Amig08*");
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div/div/div/div/div/div[2]/form/button")).click();
						
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
						
	}
	
	public static void logout(String QueNavegador) throws SQLException, Exception {
		
		String debug = "Incertidumbre cuántica";
		String queTest = "Logout";
		int resulTest=2;
		
		try{ 
			
			CuatroEnUno.driver.manage().window().maximize();
			
			CuatroEnUno.driver.findElement(By.xpath("html/body/header/div/div/ul/li[3]/a/div/span[2]")).click();
			CuatroEnUno.driver.findElement(By.xpath("html/body/header/div/div/ul/li[3]/ul/li[2]/a")).click();
						
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
						
	}
	
	
	
	
	
	
	

}//Fin 