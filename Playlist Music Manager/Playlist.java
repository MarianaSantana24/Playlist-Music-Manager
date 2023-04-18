import java.util.ArrayList;

public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Farol das Estrelas");
        listaParaIlhaDeserta.add("Bateu a Quimica");
        listaParaIlhaDeserta.add("My Future");
        listaParaIlhaDeserta.add("Conto do Pescador");
        listaParaIlhaDeserta.add("Arizona");
        listaParaIlhaDeserta.add("Good Vibe");
        listaParaIlhaDeserta.add("Máquina do Tempo");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        listaParaIlhaDeserta.remove(1);
        listaParaIlhaDeserta.remove(2);
        System.out.println(listaParaIlhaDeserta);
        int a = listaParaIlhaDeserta.indexOf("Arizona");
        int b = listaParaIlhaDeserta.indexOf("My Future");
        String tempA = listaParaIlhaDeserta.get(a);
        String tempB = listaParaIlhaDeserta.get(b);
        listaParaIlhaDeserta.set(b, tempA);
        listaParaIlhaDeserta.set(a, tempB);
        System.out.println(listaParaIlhaDeserta);
    }
    
}