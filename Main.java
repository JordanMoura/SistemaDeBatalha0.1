import java.util.Random;
import java.util.Scanner;
class   Batalha {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);

   
    
    
    
    
    
    // Variaveis declaradas somenete para testar o codigo....é necessario alteração para comunicar com demais classe
    
    Double vidaVilao1 = 100.00, danoVilao = 10.00;
    String vilao1 = "Thanos";
    //
    Double vidaHeroi1 = 100.00, vidaHeroi2 = 100.00, vidaHeroi3 = 100.00, vidaHeroi4 = 100.00;
    String heroi1 = "Jordan", heroi2 = "Lucas", heroi3 = "Natan", heroi4 = "Marcus";




    
   
    
    
    
    
    
    
    ///////// Tela principal batalha /////////
    System.out.println("-----Batalha Iniciada-----\n\n");
    
    while(vidaVilao1 > 0 && (vidaHeroi1 > 0 && vidaHeroi2 > 0 && vidaHeroi3 >0 && vidaHeroi4 > 0)){

      
    System.out.println(vilao1+"\nHP: "+vidaVilao1);
     System.out.println("===============");


    System.out.println("\n\n\n");
    System.out.println(heroi1+"\nHP: "+vidaHeroi1);
    System.out.println("===============");
    System.out.println(heroi2+"\nHP: "+vidaHeroi2);
    System.out.println("===============");
    System.out.println(heroi3+"\nHP: "+vidaHeroi3);
    System.out.println("===============");
    System.out.println(heroi4+"\nHP: "+vidaHeroi4);
    System.out.println("===============");
    


    


    System.out.println("\n\n");

     
    
    
    
    
    //// Alterar para funcionar por meio da velocidade ao inves do dado
    System.out.println("Jogando Dados:");
    Random random = new Random();
    int dado = random.nextInt(20) + 1;
    System.out.println("Dado = "+dado);
    System.out.println("\n");

    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    ////Turno do vilao
    if(dado == 1){
     
      int heroiAtual = random.nextInt(4) + 1;
      String nomeHeroiAtual;

      if(heroiAtual == 1){
        vidaHeroi1 = vidaHeroi1 - 10.00;
        nomeHeroiAtual = heroi1;
        }else if(heroiAtual == 2){
        vidaHeroi2 = vidaHeroi2 - 10.00;
        nomeHeroiAtual = heroi2;
      }else if(heroiAtual == 3){
        vidaHeroi3 = vidaHeroi3 - 10.00;
        nomeHeroiAtual = heroi3;
      }else{
        vidaHeroi4 = vidaHeroi4 - 10.00;
        nomeHeroiAtual = heroi4;
        }
      System.out.println("\n\n"+vilao1+" Ataca "+nomeHeroiAtual+" e causa 10.00 de dano");

    
    
      
      
      
      
      
      
      
      
      //Turno do player 
    }else{
     
      String heroiAtual, ataqueHeroiAtual1, ataqueHeroiAtual2, ataqueHeroiAtual3, ataqueHeroiAtual4;
      int vidaHeroiAtual, danoHeroiAtual;
      ataqueHeroiAtual1 = "Ataque Fraco";
      ataqueHeroiAtual2 = "Ataque Forte";
      ataqueHeroiAtual3 = "Ataque Crítico";
      ataqueHeroiAtual4  = "Ataque Especial";
      danoHeroiAtual = 20;
    
      
      
      //Definir de qual heroi é o turno                                             
      //+++++falta definir vida,dano e itens de cada heroi para heroiAtual
      // Ou seja nessa parte HeroiAtual deve receber todos os atributos do heroi selecionado
      if(dado == 2){
        heroiAtual = heroi1;
      }else if(dado == 3){
        heroiAtual = heroi2;
      }else if(dado == 4){
         heroiAtual = heroi3;
      }else{
         heroiAtual = heroi4;
      }  
        
    
       
      
      
      
      
      
      
      
       System.out.println(heroiAtual+" esta atuando!");
       System.out.println("Oque deseja fazer?");
       System.out.println("1-Atacar");
       System.out.println("2-Usar item da bolsa");
       System.out.println("3-Fugir");
       int escolha = read.nextInt();
       int escolhaAtaque = 0;
      System.out.println("\n\n");

      if(escolha < 1 || escolha > 3){
        System.out.println("Escolha invalida, Digite novamente:");
      
      }else if(escolha == 1){
        
        //////Menu de ataques
        while(escolhaAtaque != 1 && escolhaAtaque != 2 && escolhaAtaque != 3 && escolhaAtaque  != 4){
        System.out.println("1-"+ataqueHeroiAtual1);
        System.out.println("2-"+ataqueHeroiAtual2);
        System.out.println("3-"+ataqueHeroiAtual3);
        System.out.println("4-"+ataqueHeroiAtual4);
        escolhaAtaque = read.nextInt();

        if(escolhaAtaque < 1 || escolhaAtaque > 4){
          System.out.println("Escolha invalida, Digite novamente:");
        }else if(escolhaAtaque == 1){
          vidaVilao1 = vidaVilao1 - danoHeroiAtual;
        }else if(escolhaAtaque == 2){
          vidaVilao1 = vidaVilao1 - danoHeroiAtual;
        }else if(escolhaAtaque == 3){
          vidaVilao1 = vidaVilao1 - danoHeroiAtual;
        }else{
          vidaVilao1 = vidaVilao1 - danoHeroiAtual;
        }  
       
        System.out.println("\n\n");
      }// laço escolha ataque
         
        System.out.println(heroiAtual+" Ataca "+vilao1+" e causa "+danoHeroiAtual+" de dano");
      }

      


      
      
    
  
  
  
  
  
  
  
  
  
  
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  } // turno player
    
  
      
    
    
    
    
    
    
    } // laço repeticao prncipal
    
    if(vidaVilao1 <= 0){
      System.out.println(vilao1+ " Morreu");	
    }else{
      System.out.println("GAME OVER");
    }
  
  
  
  
  
  
  
  
  
  
  
  }}  //main e public