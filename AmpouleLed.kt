class AmpouleLed : Eclairage {

    var etat = 0

    fun AmpouleLed() {
        this.etat = 0
    }

    private fun probaPanne(): Int {
        val alea = (0..100).random()
        return if (alea < 1) {
            -1
        } else 0
    }

    override fun allumer() {
        if (this.etat != -1 && this.probaPanne() != -1) {
            this.etat = 10;
        } else {
            this.etat = -1;
        }
    }

    override fun eteindre() {
        if (this.etat != -1) {
            this.etat = 0;
        }
    }

    override fun intensifier() {
        if ( this.etat < 10) {
            this.etat++;
        }
    }

    override fun diminuer() {
        if ( this.etat > 0) {
            this.etat--;
        }
    }

    override fun etat(): Int = this.etat

    override fun toString(): String {
        return this.javaClass.name + " : " + this.etat
    }
}