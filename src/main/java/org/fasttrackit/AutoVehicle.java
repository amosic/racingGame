package org.fasttrackit;

public class AutoVehicle extends Vehicle {

    /*
    * clasa Autovehicle extinde clasa Vehicle sau o mosteneste, cu alte cuvinte 1 autovehicol este 1 vehicol asadar va mosteni toate proprietatile
    * unui vehicol si toate tipurile de comportament
    * ce are in plus 1 autovehicol fata de 1 vehicol este 1 motor, asa ca vom defini in clasa Autovehicle proprietatea "Engine engine",
    * si daca are 1 motor are si 1 consum de combustibil, il vom defini tot aici in clasa Autovehicle: mileage,
    * si ne mai ramine acum sa incadram obiectele de tip RCC in categoria Autovehicolelor si implicit a Vehicolelor. Facem lucrul acesta introducind cuvintul cheie extends
    *
    *
     */
    Engine engine;
    double mileage;


}
