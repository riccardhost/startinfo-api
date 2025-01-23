
package br.com.ifpe.startinfo.model.cliente;

import org.hibernate.annotations.SQLRestriction;
import br.com.ifpe.startinfo.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.Builder;

@Entity
@Table(name = "Cliente")
@SQLRestriction("habilitado = true")

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends EntidadeAuditavel  {

   @Column
   private String nome;

   @Column
   private String email;

   @Column
   private String cpf;

   @Column
   private String foneCelular;

}

