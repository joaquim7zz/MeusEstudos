import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.EqualsAndHashCode;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Movimentacao {

    private String tipo;
    private double valor;

    public Movimentacao(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
}
