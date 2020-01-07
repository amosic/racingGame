package org.fasttrackit;

public class RadioControlledCar extends AutoVehicle {

    int doorCount;
    Engine engine;
}

    /*
    titlul proprietatii este engine si denumirea proprietatii este tot engine
    in java denumim relatii de compozitie sau de tip has a = contine, respectiv clasa RadioControlledCar contine un obiect de tip Engine
    relatia de compozitie o exemplificam creind o noua clasa care sa reprezinte cursa acestor masini*/

     /* pe linga relatia de compozitie "has a" exista si relatia de mostenire "is a" cind o subclasa (orice clasa poate fi denumita ca subclasa a unei alte clase) a 1 alte clase mosteneste toate proprietatile si tipurile de comportament ale clasei parinte
     * eg Daca am vrea sa facem jocul nostru mai distractiv si sa permitem participarea in aceeasi cursa nu doar a masinilor teleghidate, ci si a motocicletelor teleghidate atunci am observa imediat ca ambele tipuri de obiecte: masinile teleghidate si motocicletele teleghidate contin anumite proprietati comune.
     * Si atunci am putea sa descriem in aplicatia noastra aceasta relatie creind o noua clasa denumita "Vehicle"
     *
     si ne mai ramine acum sa incadram obiectele de tip RCC in categoria Autovehicolelor si implicit a Vehicolelor. Facem lucrul acesta introducind cuvintul cheie "extends Autovehicle" pentru ca RCC sunt Autovehicole.
     * Acum putem sa stergem din clasa RCC proprietatile care s-ar repeta, proprietatile pe care oricum le mostenim de la
     * clasa "Autovehicle" care la rindul sau mosteneste proprietatile clasei "Vehicle". Asadar voi sterge din clasa RCC proprietatile: name, color, wheelcount, mileage si engine,
     * si ne va mai ramine doar "doorCount" ca proprietate specifica clasei Radiocontrolled Car.
     * Iar acum putem sa creem 1 noua clasa pentru motocicletele teleghidate care va extinde clasa "Autovehicle"
             */


