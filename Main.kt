fun main() {
    //val eclairage = AmpouleLed();
    val eclairage = Luminaire()
    //val eclairage = AmpouleTube();
    //val eclairage = AmpouleIncandescente();

    var nbCycles = 0;
    do{
        eclairage.allumer();
        while(eclairage.etat() > 0 ){
            eclairage.diminuer();
        }
        println(eclairage.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairage.etat() != -1);
    println("nombre de cycles "+nbCycles);
}