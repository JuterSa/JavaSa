
public class Solucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Costo total de la compra.
        //Costo del producto mas barato
        // Costo del producto mas caro.
        int productoMasCaro = 0;
        int totalCompra = 0;
        int productoMasBarato = 0;
        int compra[];
        int compra1[]={2700,9500,300,15000,1800,10000,400,3000,400};
        
        System.out.println(compra1.length);
        productoMasCaro=productoMasBarato= compra1[0]; //Valido los campos.
        //System.out.println(compra1.length);
        for(int i=0;i<compra1.length;i++){
            //System.out.println(compra1[i]);
            totalCompra +=compra1[i];
            if(compra1[i]>productoMasCaro){
                productoMasCaro = compra1[i];
            }else if(compra1[i]<productoMasBarato){
                productoMasBarato = compra1[i];  // Elemento mas pequeño..
            }
        }
        int reporte[]={totalCompra,productoMasBarato,productoMasCaro};
        for(int i=0;i<3;i++){
            System.out.println(reporte[i]);
        }
        System.out.println("Costo total de la compra. "+totalCompra);
        System.out.println("Costo del producto mas barato. "+productoMasBarato);
        System.out.println("Costo del producto mas caro. "+productoMasCaro);
        System.out.println();
    }
    
}
