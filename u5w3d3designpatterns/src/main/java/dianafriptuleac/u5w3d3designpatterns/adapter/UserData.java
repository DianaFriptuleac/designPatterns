package dianafriptuleac.u5w3d3designpatterns.adapter;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
