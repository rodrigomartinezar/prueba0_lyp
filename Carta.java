

public class Carta {

    // variables de instancia
    protected Pinta pinta;
    protected Numero numero;

    public Carta(){
        this.pinta=pinta;
        this.numero=numero;

    }
    public Carta(Pinta pintaSeleccionada, Numero numeroSeleccionado){
        this.numero=numeroSeleccionado;
        this.pinta=pintaSeleccionada;
    }

    public Pinta getPinta() {
        return this.pinta;
    }

    public Numero getNumero() {
        return this.numero;
    }


    @Override
    public boolean equals(Object o) {
        if (o instanceof Carta)
            return (this.getPinta() == ((Carta)o).getPinta() && this.getNumero() == ((Carta)o).getNumero());
        return false;
    }

    @Override
    public int hashCode() {
        return (this.getPinta().name() + this.getNumero().name()).hashCode();
    }

    @Override
    public String toString() {
        return this.getNumero().name() + " de " + this.getPinta().name();
    }

}