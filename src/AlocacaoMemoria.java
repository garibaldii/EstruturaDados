public class AlocacaoMemoria {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        System.out.println("Memoria total da JVM: " + rt.totalMemory());
        
        double m1, m2;
        
        m1 = rt.freeMemory();
        
        System.out.println("Memoria antes da criação dos objetos: " + rt.freeMemory());
        
        double vetor[] = new double[100000];
        
        
        for (int i = 0; i < 100000; i++) {
            vetor[i] = i;
        }
        
        m2 = rt.freeMemory();
        
        System.out.println("Memoria depois da criação dos objetos: " + rt.freeMemory());
        
        System.out.println("Memoria utilizada: " + (m1 - m2) + " bytes");
        
        rt.gc();
        
        System.out.println("Memoria depois executar o gc: " + rt.freeMemory());
    }
}
