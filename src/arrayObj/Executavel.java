package arrayObj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Executavel {

    public static void main(String[] args) {
        /*Usuario[] usuario = new Usuario[2];
        usuario[0] = new Usuario("Jose", "root");
        usuario[1] = new Usuario("Maria", "root");

        for (Usuario user : usuario) {
            System.out.println(user.getNome());
        }*/

        List<String> lista = new ArrayList<String>();
        lista.add("Pedro");
        lista.add("João");
        lista.add("Maria");
        lista.add("Marcos");
        lista.add("Anna");
        lista.add("Jose");
        lista.add("Pedro");

        List<Usuario> list = new ArrayList<Usuario>();
        Usuario jose = new Usuario("Jose", "123");
        Usuario maria = new Usuario("Maria", "123");
        Usuario pedro = new Usuario("Pedro", "123");

        list.add(jose);
        list.add(maria);
        list.add(pedro);

        for (Usuario malandro : list.toArray(new Usuario[0])) {
            System.out.println("Nome: " + malandro.getNome());
        }

        remover("Pedro", list);

        System.out.println();
        for (Usuario malandro : list.toArray(new Usuario[0])) {
            System.out.println("Nome: " + malandro.getNome());
        }

    }

    public static List<Usuario> remover(String nome, List<Usuario> list) {
        //Iterator<Usuario> iterator = list.iterator();
        list.removeIf(usuario -> usuario.getNome().equals(nome));
       /* while (iterator.hasNext()) {
            Usuario usuario = iterator.next();
            if(usuario.getNome().equals(nome)) {
                iterator.remove();
            }
        }*/
        return list;
    }



}
