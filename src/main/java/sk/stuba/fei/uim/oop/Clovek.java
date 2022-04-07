package sk.stuba.fei.uim.oop;

import lombok.*;

import java.util.List;
//@Getter  //getter pre vsetky atributy
@AllArgsConstructor
@NoArgsConstructor
@Data //robia vsetko naraz getter,setter atd
public class Clovek {
    private String meno;
    //@Setter //setter only pre adresu
    private String adresa;
    private double vyska;
    private double vaha;
    private int vek;
    private List<Clovek> kamarati;
}
