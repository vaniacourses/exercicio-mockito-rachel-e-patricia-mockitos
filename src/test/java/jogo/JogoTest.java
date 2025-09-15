package jogo;

// import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class JogoTest {
	// Testando
    @Test
    public void testarJogo() {

        Jogador jogador = mock(Jogador.class);
        Dado dado1 = mock(Dado.class);
        Dado dado2 = mock(Dado.class);        

        when(dado1.numero()).thenReturn(20);
        when(dado2.numero()).thenReturn(14);

        when(jogador.lancar(dado1, dado2)).thenReturn(34); 
        
        Integer a = jogador.lancar(dado1, dado2);

        // Verificar se o metodo foi chamado
        verify(jogador).lancar(dado1, dado2);

        assertEquals(a, 34);
    }

}
