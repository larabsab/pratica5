package integracao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AlunoTest {
	
	private Aluno aluno;

	@Before
	public void setUp() {
		aluno = new Aluno();
	}

	@Test
	public void testCalcularAprovacao_ReprovacaoFrequencia(){
		aluno.setFrequencia(74);
		aluno.setNota1(100);
		aluno.setNota2(100);
		assertEquals(74, aluno.getFrequencia());
		assertFalse(aluno.calcularAprovacao());
	}

	@Test
	public void testCalcularAprovacao_ReprovacaoNota() {
		aluno.setFrequencia(75);
		aluno.setNota1(29);
		aluno.setNota2(29); 
		assertEquals(29, aluno.getNota1(), 0.01);
		assertEquals(29, aluno.getNota2(), 0.01); 
		assertFalse(aluno.calcularAprovacao());
	}

	@Test
	public void testAprovacao_AprovacaoNota(){
		aluno.setFrequencia(75);
		aluno.setNota1(70);
		aluno.setNota2(70);
		assertEquals(70, aluno.getNota1(), 0.01);
		assertEquals(70, aluno.getNota2(), 0.01);
		assertTrue(aluno.calcularAprovacao());
	}

	@Test
	public void testAprovacao_AprovacaoFinal(){
		aluno.setFrequencia(75);
		aluno.setNota1(40);
		aluno.setNota2(40);
		aluno.setNotaFinal(60);
		assertEquals(40, aluno.getNota1(), 0.01);
		assertEquals(40, aluno.getNota2(), 0.01);
		assertTrue(aluno.calcularAprovacao());
	}

	@Test
	public void testCalcularAprovacao_ReprovacaoFinal(){
		aluno.setFrequencia(75);
		aluno.setNota1(30);
		aluno.setNota2(30);
		aluno.setNotaFinal(69);
		assertEquals(30, aluno.getNota1(), 0.01);
		assertEquals(30, aluno.getNota2(), 0.01);
		assertFalse(aluno.calcularAprovacao());
	}
}