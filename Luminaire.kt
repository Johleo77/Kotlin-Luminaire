class Luminaire : Eclairage {
    val ampoule1 = AmpouleIncandescente()
    val ampoule2 = AmpouleIncandescente()
    val ampoule3 = AmpouleIncandescente()
    val ampoule4 = AmpouleIncandescente()


    constructor()

    override fun allumer() {
        this.ampoule1.allumer()
        this.ampoule2.allumer()
        this.ampoule3.allumer()
        this.ampoule4.allumer()
    }

    override fun eteindre() {
        this.ampoule1.eteindre()
        this.ampoule2.eteindre()
        this.ampoule3.eteindre()
        this.ampoule4.eteindre()
    }

    override fun intensifier() {
        this.ampoule1.intensifier()
        this.ampoule2.intensifier()
        this.ampoule3.intensifier()
        this.ampoule4.intensifier()

    }

    override fun diminuer() {
        this.ampoule1.diminuer()
        this.ampoule2.diminuer()
        this.ampoule3.diminuer()
        this.ampoule4.diminuer()

    }

    override fun etat(): Int {
        var etat = ampoule1.etat
        this.ampoule1.etat = etat
        if (this.ampoule2.etat > etat) {
        }
        if (this.ampoule3.etat > etat) {
        }
        if (this.ampoule4.etat > etat) {
        }

        return etat


    }

    override fun toString(): String {
        return "Luminaire(ampoule1=$ampoule1, ampoule2=$ampoule2, ampoule3=$ampoule3, ampoule4=$ampoule4, etat=${this.etat()})"
    }
}