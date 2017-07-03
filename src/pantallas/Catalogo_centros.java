package pantallas;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import selenium.CuatroEnUno;
import selenium.DAO;



public class Catalogo_centros {
	
	public static void Acceso_catalogo_centros(String QueNavegador, String IP_SERVIDOR) throws SQLException, Exception {
		
		String debug = "Incertidumbre cuántica";
		String queTest = "Cargar catálogo centros";
		int resulTest=2;
		
		try{ 
			
			CuatroEnUno.driver.get("http://"+IP_SERVIDOR+"/agintzari-gipuzkoa/servicio/index"); 
			
			CuatroEnUno.driver.findElement(By.xpath("div[@id='sidebar-left']/div/ul/li[9]/a/span")).click();	
			CuatroEnUno.driver.findElement(By.xpath("div[@id='sidebar-left']/div/ul/li[9]/ul/li/a/span")).click();
			
		
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
	
/*	
	public static void Alta_catalogo_centros(String QueNavegador) throws SQLException, Exception {
		
		String debug = "Incertidumbre cuántica";
		String queTest = "Alta catálogo centros";
		int resulTest=2;
		
		try{ 
			
			CuatroEnUno.driver.manage().window().maximize();
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[3]/form/div/div[2]/div/div/div[1]/div/a")).click();
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div/form/div[1]/div/div/div/div/div/div/input")).click();			
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div/form/div[1]/div/div/div/div/div/div/div/ul/li[1]/div/div[1]/table/tbody/tr[2]/td[1]")).click();
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div/form/div[2]/div/div[1]/div/div/select")).click();
			CuatroEnUno.driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div/div[1]/div/div/form/div[2]/div/div[1]/div/div/select/option[2]/text()")).click();
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div/form/div[3]/div/div[1]/div/div/textarea")).sendKeys("prueba bot");
			CuatroEnUno.driver.findElement(By.xpath("html/body/div/div[1]/div[2]/div/div/div[1]/div/div/form/div[2]/div/div[2]/div/div/select/option[3]/text()")).click();
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div/form/div[3]/div/div[2]/div/div/textarea")).sendKeys("prueba bot");
			CuatroEnUno.driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div/div/div[4]/div/div/button")).click();
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
*/		
	
	

}//Fin 

