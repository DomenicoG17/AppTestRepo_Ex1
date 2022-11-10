package myjenktest.tutorial.test;

import org.junit.jupiter.api.*; //con l'asterisco importiamo direttamente tutte le librerie necessarie

import myjenktest.tutorial.FizzBuzz;

public class FizzBuzzTest {
	public FizzBuzz fb;
	
	@BeforeEach //fallo prima di ogni test
	public void setup() {
		fb=new FizzBuzz();
	}

	
	@DisplayName("Play FizzBuzz with number=1")//ciò che comparirà nel report
	@Test
	public void testNumber() {
		String risultato=fb.play(1);
		Assertions.assertEquals(risultato,"200"); //compara il risultato ottenuto con quello pianificato
												//se non coincidono, il test non va a buon fine
	}
	 
	/*
	@DisplayName("Play FizzBuzz with number=1, verifica con 'ciao'")//ciò che comparirà nel report
	@Test
	public void testNumber() {
		String risultato=fb.play(1);
		Assertions.assertEquals(risultato,"ciao"); //compara il risultato ottenuto con quello pianificato
												//se non coincidono, il test non va a buon fine
	}
	*/
	
	
	
	
	@DisplayName("Play FizzBuzz with number=3")
	@Test
	public void testFizz() {
		String risultato=fb.play(3);
		Assertions.assertEquals(risultato, "Fizz");
	}

}
