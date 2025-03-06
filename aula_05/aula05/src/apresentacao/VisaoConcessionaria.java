package apresentacao;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import negocio.Carro;
import negocio.Fabricante;
import negocio.Moto;
import negocio.Veiculo;

public class VisaoConcessionaria {
    public static void main(String[] args) {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Veiculo objVeiculo = null;
        String opcao = "";

        //entrada de dados

        try {
            System.out.println("Digite <C> para ou <M> para a moto: ");
            opcao = leitor.readLine();
            
            if (opcao.equalsIgnoreCase("C")) {
                objVeiculo = new Carro();
                
            } else {
                objVeiculo = new Moto();
            }   
            System.out.println("Digite o modelo: ");
            objVeiculo.setModelo(leitor.readLine());
            
            System.out.println("Digite o fabricante: ");
            objVeiculo.setObjFabricante(new Fabricante(leitor.readLine()));
            
        System.out.println("Digite a cor: ");
        objVeiculo.setCor(leitor.readLine());
        
        if (opcao.equalsIgnoreCase("C")) {
            System.out.println("Digite <S> se houver teto solar: ");
            ((Carro)objVeiculo).setTetoSolar(leitor.readLine().equalsIgnoreCase("S"));
        }else {
            System.out.println("Digite a cilindrada: ");
            ((Moto)objVeiculo).setCinlidro(Integer.parseInt(leitor.readLine()));
        }

    } catch (Exception erro) {
      System.out.println("erro");
    }
    //saída
            System.out.println("Modelo: "+ objVeiculo.getModelo());
            System.out.println("Fabricante: "+ objVeiculo.getObjFabricante().getNome());
            System.out.println("Cor"+ objVeiculo.getCor());
          if (opcao.equalsIgnoreCase("C")) {
             System.out.println("Teto Solar: " +(((Carro)objVeiculo).isTetoSolar()? "SIM"    :    "NÃO"));
        } else {
             System.out.println("Cilindrada: " + ((Moto)objVeiculo).getCinlidro());

        
         }
    }

}
