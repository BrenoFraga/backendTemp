package findr.projectfindr.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;


@Entity
@Table(name = "contactor")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Contactor extends User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContactor;

    @ManyToOne
    @JoinColumn(name = "fk_plan_contactor")
    private Plans fkPlanContactor;

}
