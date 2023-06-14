import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class PortaoTests {

    @BeforeEach
    public void CleanSingletonInstance(){
        //Cleanup singleton values
        Portao.getInstance().setAbrir(false);
        Portao.getInstance().setFechar(false);
        System.out.println("###### Clean instance ######");
    }

    @Test
    public void Given_AbrirPortao_When_SetTrue_Then_PortaoShoudOpen(){
        Portao.getInstance().setAbrir(true);
        boolean portaoOpen = Portao.getInstance().getAbrir();
        assertEquals(true, portaoOpen);
    }

    @Test
    public void Given_AbrirPortao_When_SetTrue_Then_PortaoShoudNotClose(){
        Portao.getInstance().setAbrir(true);
        boolean portaoClose = Portao.getInstance().getFechar();
        assertEquals(false, portaoClose);
    }

    @Test
    public void Given_FecharPortao_When_SetTrue_Then_PortaoShoudClose(){
        Portao.getInstance().setFechar(true);
        boolean portaoClose = Portao.getInstance().getFechar();
        assertEquals(true, portaoClose);
    }

    @Test
    public void Given_FecharPortao_When_SetTrue_Then_PortaoShoudNotOpen(){
        Portao.getInstance().setFechar(true);
        boolean portaoOpen = Portao.getInstance().getAbrir();
        assertEquals(false, portaoOpen);
    }

}
