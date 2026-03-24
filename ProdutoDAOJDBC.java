import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOJDBC implements ProdutoDAO {
    
    @Override
    public void inserir(Produto produto){

    }

    @Override
    public List<Produto> listar(){
        
        return new ArrayList<>();
    }

    @Override
    public Produto buscarPorId(int id){

        return null;
    }

    @Override
    public void remover(int id){
        
    }
}
