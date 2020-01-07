package org.fasttrackit;

/*
 * Hello world!
 *
 */

/*
clasele sunt descrieri ale modelului dupa care se pot construi obiecte de 1 anumit tip
si acum sa vedem cum vom construi obiecte concrete pe baza acestor modele
hai sa deschidem clasa App, iar in interiorul metodei public static void main(String[]args){
}
  sa creem 1 astfel de obiect concret de tipul Race: sa introducem in aplicatia noastra cursa de masini
cum facem acest lucru, destul de simplu, vom folosi si vom aminti tipul obiectului pe care vrem
        sa-l istantiem (sau construim) respectiv Race() si 1 pereche de paranteze. Aceasta notatie este de fapt 1 constructor
        (despre constructori vom vorbi putin mai tirziu), deocamdata putem sa retinem doar ca in acest fel
        istantiem (sau creem) 1 obiect dintr-o anumita clasa. Acum apas ;
    */
public class App 
{
    /*
     * metoda public static void main este una dedicata in java si va fi prima executata la pornirea(rularea) aplicatiei noastre
     * daca dau 1xclick dreapta pe main am Run'App main()' si pot rula direct aplicatia
     * in cazul nostru la pornirea aplicatiei se va executa acest cod "Hello World" care este cuprins intre acoladele metodei si care va scrie un log in consola IDE-ului
     * vom vorbi si despre log-uri putin mai tirziu, deocamdata vom sterge acest cod demonstrativ "Hello World"
     * despre notatia cu paranteze drepte spunem ca e 1 sir de obiecte de tip string
     * vom vorbi despre siruri intr-o alta lectie
     * deocamdata atit despre clasa App
     *
     * in lectia urmatoare ne intoarcem din nou la clase si vom vedea cum putem obtine obiecte concrete pe baza claselor create
     * de ex avem clasa RadioControlledCar cu proprietatile ei,
     * dar aceasta clasa nu este in sine un obiect de tip RadioControlledCar respectiv o masina teleghidata cu
     * proprietatile (atributele) ei
     * dupa cum nici descrierea tehnica a unei masini teleghidate nu este in sine o masina teleghidata, doar o hirtie informativa
     * in lectia urmatoare vom vedea cum putem obtine obiecte concrete pe baza claselor care se descriu
     * si vom vorbi si despre variabile-ce sunt variabilele si cum le folosim
     *1 lucru pe care e bine sa-l observa acum este ca chiar daca am sters mai multe proprietati din clasa RCC in clasa Race, in clasa App nu ne-a aparut nici o eroare
    in continuare au 1 proprietate name, 1 proprietate color..
     */

    public static void main( String[] args )
    {
      Race race = new Race();

      RadioControlledCar dacia = new RadioControlledCar();
      dacia.name = "Dacia";
      dacia.color = "red";
      dacia.doorCount = 4;
      dacia.wheelCount = 4;
      dacia.mileage = 8.5;

      Engine daciaEngine = new Engine();
      daciaEngine.manufacturer = "Renault";

      dacia.engine = daciaEngine;

      RadioControlledCar lada = new RadioControlledCar();
      lada.name = "lada";
      lada.color = "blue";
      lada.doorCount = 2;
      lada.wheelCount = 4;
      lada.mileage = 8;

      Engine ladaEngine = new Engine();
      ladaEngine.manufacturer = "Lada";

      race.firstCar = dacia;
      race.secondCar = lada;
    }
}
