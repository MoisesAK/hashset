public class Main {

    public static void main(String[] args) {

        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.insert("1");
        set1.insert("2");
        set1.insert("3");

        set2.insert("3");
        set2.insert("6");

        System.out.println("set1 tem 1? : " + set1.contains("1"));
        System.out.println("set2 tem 1? : " + set2.contains("1"));

        set1.remove("2");
        System.out.println("tamanho set1 depois de remover o 2: " + set1.size());

        HashSet<String> set1UnionSet2 = set1.union(set2);
        System.out.println("tamanho da uniao de set1 e set2: " + set1UnionSet2.size());

        HashSet<String> set1IntersectionWithSet2 = set1.intersection(set2);
        System.out.println("tamanho da interseção: " + set1IntersectionWithSet2.size());

        HashSet<String> set1DifferenceWithSet2 = set1.difference(set2);
        System.out.println("diferença do set1 para o set2: " + set1DifferenceWithSet2.size());

        HashSet<String> set2DifferenceWithSet1 = set2.difference(set1);
        System.out.println("diferença do set2 para o set1: " + set2DifferenceWithSet1.size());

    }
}

