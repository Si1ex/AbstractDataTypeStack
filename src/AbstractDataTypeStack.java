import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 * ITSEARVIOINTI TÃ„HÃ„N:
 *  Tehtävänanto tuntui aluksi hankalalta, mutta kun tajusi mistä on kyse niin se ei tuntunut niin vaikealta, ainakaan ArrayList-toteutuksella.
 *  Halusin tehdä ensin helpoimmalla ratkaisutavalla ja kokeilla muita ratkaisutapoja, jos riittää taito ja aika. Aikaa ei lopulta riittänyt.
 *  Kaikki operaatiot ovat vakioaikaisia, mutta esim. keskeltä poistamisen jälkeen joutuu ohjelma siirtämään alkioita. Pop2-metodissa ohjelma poistaa toiseksi ylimmän alkion
 *  ja joutuu siirtämään yhtä alkiota. Mielestäni se ei tee aikavaativuudesta neliöllistä, koska ohjelman ei tarvitse käydä koko ArrayListiä läpi.
 */


/**
 * Kurkistuspino: pino lisÃ¤ttynÃ¤ toiseksi pÃ¤Ã¤llimmÃ¤isen alkion kurkkimisella ja poistamisella.
 * @param <E> alkiotyyppi
 */
public class TRAI_22_X7_dankurhi<E> implements TRAI_22_X7<E> {

    public TRAI_22_X7_dankurhi() {
        talletusTaulukko = new ArrayList<E>();
    }

    /**
     * Palauttaa pinossa olevien alkioiden lukumÃ¤Ã¤rÃ¤n.
     *
     * @return alkioiden mÃ¤Ã¤rÃ¤.
     */
    @Override
    public int size() {
        return talletusTaulukko.size();
    }

    /**
     * LisÃ¤Ã¤ alkion x pinoon pÃ¤Ã¤llimmÃ¤iseksi.
     *
     * @param x lisÃ¤ttÃ¤vÃ¤ alkio.
     */
    @Override
    public void push(E x) {
        talletusTaulukko.add(x);
    }

    /**
     * Pinon pÃ¤Ã¤llimmÃ¤inen alkio.
     *
     * @return pinon pÃ¤Ã¤llimmÃ¤inen alkio.
     * @throws NoSuchElementException jos pino on tyhjÃ¤.
     */
    @Override
    public E top() {
        if (talletusTaulukko.isEmpty()) {
            throw new NoSuchElementException();
        }
        else {
            return talletusTaulukko.get(talletusTaulukko.size()-1);
        }
    }

    /**
     * Pinon toiseksi pÃ¤Ã¤llimmÃ¤inen alkio.
     *
     * @return pinon toiseksi pÃ¤Ã¤llimmÃ¤inen alkio.
     * @throws NoSuchElementException jos pinossa on vÃ¤hemmÃ¤n kuin kaksi alkiota.
     */
    @Override
    public E top2() {
        if (talletusTaulukko.size() < 2) {
            throw new NoSuchElementException();
        }
        return talletusTaulukko.get(talletusTaulukko.size()-2);
    }


    /**
     * Poistaa pinon pÃ¤Ã¤llimmÃ¤isen alkion.
     *
     * @return poistettu pinon pÃ¤Ã¤llimmÃ¤inen alkio.
     * @throws NoSuchElementException jos pino on tyhjÃ¤.
     */
    @Override
    public E pop() {
        if (!talletusTaulukko.isEmpty()) {
            E x = talletusTaulukko.get(talletusTaulukko.size() - 1);
            talletusTaulukko.remove(talletusTaulukko.size() - 1);
            return x;
        }
        else {
            throw new NoSuchElementException();
        }
    }

    /**
     * Poistaa pinon toiseksi pÃ¤Ã¤llimmÃ¤inen alkio.
     *
     * @return poistettu pinon toiseksi pÃ¤Ã¤llimmÃ¤inen alkio.
     * @throws NoSuchElementException jos pinossa on vÃ¤hemmÃ¤n kuin kaksi alkiota.
     */
    @Override
    public E pop2() {
        if (talletusTaulukko.size() < 2) {
            throw new NoSuchElementException();
        }
        return talletusTaulukko.remove(talletusTaulukko.size()-2);
    }
}