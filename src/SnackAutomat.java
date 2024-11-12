public class SnackAutomat {

    public int køb(int pris, int betalt) {
        int differens = pris - betalt;
        InvaldValueToPurchase IVTO;

        try {
            if (pris <= 0 || betalt <= 0) {
                throw new InvaldValueToPurchase("Pris, eller betalte sum er ugyldig.");
            }
        } catch (InvaldValueToPurchase e) {
            System.out.println("fejl: " + e.getLocalizedMessage());
        }
        return differens;

    }

    public void byttePenge(int differens) {

        //Hvor mange 20'ere
        int antaLTyvere = Math.divideExact(differens, 20);
        if (antaLTyvere<0){
            antaLTyvere = Math.multiplyExact(antaLTyvere, -1);
        }
        differens = differens % 20;

        int antalTierer = Math.divideExact(differens, 10);
        if(antalTierer<0){
            antalTierer = Math.multiplyExact(antalTierer, -1);
        }
        differens = differens % 10;

        int antalFemerer = Math.divideExact(differens, 5);
        if(antalFemerer<0){
            antalFemerer = Math.multiplyExact(antalFemerer, -1);
        }
        differens = differens % 5;

        int antalToer = Math.divideExact(differens, 2);
        if(antalToer<0){
            antalToer = Math.multiplyExact(antalToer, -1);
        }
        differens = differens % 2;

        int antalEttere = Math.divideExact(differens, 1);
        if(antalEttere<0){
            antalEttere = Math.multiplyExact(antalEttere, -1);
        }
        differens = differens % 1;

        System.out.println("Dine byttepenge er:     " + antaLTyvere + " x 20kr, " + antalTierer + " x 10kr, " + antalFemerer + " x 5kr, " + antalToer + " x 2kr, " + "og " + antalEttere + " x 1kr.");

    }

}
