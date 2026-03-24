public class Main{
    
   public static void main(String[] args) {
        Produto produtoA = new Produto(1, "Mouse", 179.99);
        Produto produtoB = new Produto(2, "Teclado", 499.99);

        ProdutoDAOLista produtos = new ProdutoDAOLista();
        produtos.inserir(produtoA);
        produtos.inserir(produtoB);

        for (Produto p : produtos.listar()) {
            System.out.printf("%d. Nome: %s | Preço: %f\n", p.getId(), p.getNome(), p.getPreco());
        }

        int idProcurado = 2;
        for (Produto p : produtos.listar()) {
            if(p.getId() == idProcurado){
                System.out.printf("%d. Nome: %s | Preço: %f\n", p.getId(), p.getNome(), p.getPreco());
                idProcurado = 0;
                break;
            }
        }
        if(idProcurado != 0){
            System.out.println("Produto não encontrado");
        }

        produtos.remover(1);

        

   }



    
    


}