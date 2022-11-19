package Maquina;

import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  MachineControl controlar = new MachineControl();
  Scanner leitura = new Scanner(System.in);
    int valor = 2,quantidade, dinheiro,sim,cedula_extra=0,ler_cedula_extra=0;
    
    System.out.println("Insira a quantidade de refrigerantes para compra:\n");
    quantidade = leitura.nextInt();
    controlar.setQuantidade(quantidade);
    System.out.println("\nSelecione a opção de cédula:\n1- 1$\n2- 2$\n3- 5$\n4- 10$\n");
    dinheiro = leitura.nextInt();
    System.out.println("\nVocê desja inserir mais uma cédula?\n1- Sim\n2- Não");
    sim = leitura.nextInt();
    
    if(sim == 1){
      System.out.println("\nSelecione a opção de cédula:\n1- 1$\n2- 2$\n3- 5$\n4- 10$\n");
      ler_cedula_extra = leitura.nextInt();
      if(ler_cedula_extra == 1){
     cedula_extra = 1;
    }
      else if (ler_cedula_extra == 2){
      cedula_extra= 2;
    }
      else if (ler_cedula_extra == 3){
      cedula_extra = 5;
    }
      else{
      cedula_extra = 10;
    }
      controlar.setCedulaExtra(cedula_extra);
    }
    else{
      controlar.setCedulaExtra(cedula_extra);
    }
    controlar.escolha(dinheiro);
    
  }
}