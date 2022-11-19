package Maquina;

public class MachineControl{
    private int opcaoDeCedula, valor = 2,valorTotal, troco, dinheiro=0,cedulaExtra;
        private int precoUnitario = 2;
        private int quantidade;
      //Set and Get
         public void setOpcaoDeCedula(int opcaoDeCedula1){
          this.opcaoDeCedula = opcaoDeCedula1;
        }
      
        public void setPrecoUnitario(int precoUnitario1){
          this.precoUnitario = precoUnitario1;
        }
      
        public void setQuantidade(int quantidade1){
          this.quantidade = quantidade1;
        }
      
         public int getOpcaoDeCedula(){
          return this.opcaoDeCedula;
        }
      
         public int getQuantidade(){
          return this.quantidade;
        }
      // Metodos
        public void compra (int quantidade,int valor){
          valor = quantidade * precoUnitario;
        }
      
        public void setCedulaExtra(int cedulaExtra1){
          this.cedulaExtra = cedulaExtra1;
        }
      
        public void escolha (int cedula){
          if(cedula == 1){
            dinheiro = 1+ this.cedulaExtra;
          }
            
          else if (cedula == 2){
            dinheiro= 2+ this.cedulaExtra;
          }
            
          else if (cedula == 3){
            dinheiro = 5+ this.cedulaExtra;
          }
            
          else{
            dinheiro = 10+ this.cedulaExtra;
          }
          
          valorTotal = valor* getQuantidade();
          if(dinheiro >= valorTotal){
            troco = dinheiro - valorTotal;
          if(troco!=0){
            System.out.println("\nCompra realizada!\nO seu troco é: "+troco);
          }
            
          else{
            System.out.println("\nTodo valor gasto, você não receberá troco!");
          }
        }
          else{
            troco = dinheiro;
            System.out.println("\nNão é possivel concluir a operação!\nRetornando o valor de:           "+troco);
        }
    }
    
    
    
    
      
    }