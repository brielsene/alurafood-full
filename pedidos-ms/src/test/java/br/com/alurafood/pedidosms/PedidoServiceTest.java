package br.com.alurafood.pedidosms;

import br.com.alurafood.pedidosms.model.Pedido;
import br.com.alurafood.pedidosms.model.Status;
import br.com.alurafood.pedidosms.repository.PedidoRepository;
import br.com.alurafood.pedidosms.service.PedidoService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;


import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

//@Import(PedidoRepository.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ExtendWith(MockitoExtension.class)
public class PedidoServiceTest {

    @Mock
    private PedidoRepository repository;

    @InjectMocks
    private PedidoService pedidoService;


    @Test
    public void testeTranquilao(){
        Pedido pedido = new Pedido();
        pedido.setId(1l);
        pedido.setStatus(Status.REALIZADO);
        when(repository.porIdComItens(1l)).thenReturn(pedido);
        pedidoService.aprovaPagamentoPedido(1l);





    }
}
