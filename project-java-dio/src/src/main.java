// Classe Main no pacote 'src'
package src;

// Importando as classes necessárias dos respectivos pacotes
import subsistema2.cep.CepApi;
import subsistema1.crm.CrmService;

public class main {
    public static void main(String[] args) {
        // Usando a classe CepApi para recuperar cidade e estado
        CepApi cepApi = CepApi.getInstancia();
        String cidade = cepApi.recuperarCidade("12345-678");
        String estado = cepApi.recuperarEstado("12345-678");

        // Usando a classe CrmService para gravar informações do cliente
        CrmService.gravarCliente("Cliente Teste", "12345-678", cidade, estado);
    }
}
