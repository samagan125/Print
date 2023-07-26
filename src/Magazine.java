public class Magazine implements Printable{
    private int sena;

    public Magazine(int sena) {
        this.sena = sena;
    }

    public int getSena() {
        return sena;
    }

    public void setSena(int sena) {
        this.sena = sena;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "sena=" + sena +
                '}';
    }

    @Override
    public void Print() {
        System.out.println("Print is magazine");
    }
}
