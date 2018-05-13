package croho;

import java.util.ArrayList;
/*
 * 8 oktober 2017
 * CPP-Java OpiJ1 Opdracht 1 definitief
 * @author Steven Minken
 */
public class CrohoSysteem {
 
  public static void main(String[] args) {
    
//    Maak nieuw Croho object aan
    Croho crohoInstantie = new Croho();
    crohoInstantie.init();
    
//    Voeg universiteit toe aan Croho object. Opdracht a
    crohoInstantie.voegtoeInstelling("Rijksuniversiteit Groningen", Instellingssoort.WO , "Groningen", 7654);

//    Maak lijsten voor instellingen en plaatsen
    ArrayList<Instelling> instellingen = new ArrayList<Instelling>();
    ArrayList<Plaats> plaatsen = new ArrayList<Plaats>();
    
//    Vul de lijsten instellingen en plaatsen
    instellingen = crohoInstantie.getInstellingen();
    plaatsen = crohoInstantie.getPlaatsen();

    
//    itereer over de lijst instellingen voor opdracht b
    for(Instelling instelling: instellingen) {
      Plaats plaats = instelling.getPlaats();
      System.out.println(instelling.getNaam() + " (" + instelling.getSoort() + ") " + "te " + plaats.getNaam());
    }
    
    System.out.println("\n");
    
//    declareer attributen
    int aantalHboStudenten = 0;
    int aantalWoStudenten = 0;
    
//    itereer over de instellingen voor opdracht c
    for(Instelling instelling: instellingen) {
      
      if (instelling.getSoort().equals(Instellingssoort.HBO)) {
        aantalHboStudenten = aantalHboStudenten + instelling.getAantalStudenten();
      } else if (instelling.getSoort().equals(Instellingssoort.WO)) {
        aantalWoStudenten = aantalWoStudenten + instelling.getAantalStudenten();
    }
  }
    
    System.out.println("Totaal aantal WO-studenten is " + aantalWoStudenten);
    System.out.println("Totaal aantal HBO studenten is " + aantalHboStudenten);

    System.out.println("\n");
    
//    declareer attribuut voor opdracht d
    int aantalStudenten = 0;
    
//    itereer over de lijst steden, zoek welke instellingen zich daar bevinden en tel deze op
    for(Plaats plaats: plaatsen) {

      for(Instelling instelling: instellingen) {
          Plaats plaatsInstelling = instelling.getPlaats();
          if (plaatsInstelling.getNaam().equals(plaats.getNaam())) {
            aantalStudenten = aantalStudenten + instelling.getAantalStudenten();
            
        }
      }
      System.out.println("In " + plaats.getNaam() + " studeren " + aantalStudenten + " studenten");
    }
  }
}




