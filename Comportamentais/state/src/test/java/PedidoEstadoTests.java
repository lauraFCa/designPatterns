import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        PedidoCanceladoTests.class,
        PedidoConfirmadoTests.class,
        PedidoEntregueTests.class,
        PedidoEnviadoTests.class
})
public class PedidoEstadoTests {
}
