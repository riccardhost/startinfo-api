
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

   private String nomeCompleto;

   private String email;

   private String password;
  
   private String foneCelular;

   private String cpf;
   
   public Cliente build() {

       return Cliente.builder()
           .nomeCompleto(nomeCompleto)
           .email(email)
           .password(password)
           .foneCelular(foneCelular)
           .cpf(cpf)
           .build();
   }

}
