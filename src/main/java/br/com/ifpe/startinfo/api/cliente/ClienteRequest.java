
package br.com.ifpe.startinfo.api.cliente;

import br.com.ifpe.startinfo.model.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteRequest {

   private String nome;

   private String email;

   private String cpf;

   private String foneCelular;
   
   public Cliente build() {

       return Cliente.builder()
           .nome(nome)
           .email(email)
           .cpf(cpf)
           .foneCelular(foneCelular)
           .build();
   }

}
